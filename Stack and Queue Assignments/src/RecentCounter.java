import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) 
    {
        // Add the new request to the queue
        requests.offer(t);

        // Remove requests that are outside the time frame [t - 3000, t]
        while (!requests.isEmpty() && requests.peek() < t - 3000) 
        {
            requests.poll();
        }

        // Return the number of requests within the time frame
        return requests.size();
    }

    public static void main(String[] args) 
    {
        // Example usage:
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));     // Output: 1
        System.out.println(recentCounter.ping(100));   // Output: 2
        System.out.println(recentCounter.ping(3001));  // Output: 3
        System.out.println(recentCounter.ping(3002));  // Output: 3
    }
}
