import java.util.PriorityQueue;

class MedianFinder {

    private PriorityQueue<Integer> maxHeap; // to store the smaller half of the numbers
    private PriorityQueue<Integer> minHeap; // to store the larger half of the numbers

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        maxHeap.offer(num); // Add to maxHeap

        minHeap.offer(maxHeap.poll()); // Balance the heaps

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        System.out.println(medianFinder.findMedian()); 
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); 
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); 
    }
}
