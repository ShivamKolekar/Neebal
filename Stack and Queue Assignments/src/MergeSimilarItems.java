import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> valueWeights = new HashMap<>();

        processItems(items1, valueWeights);

        processItems(items2, valueWeights);

        List<List<Integer>> retList = new ArrayList<>();
        for (int value : valueWeights.keySet()) {
            int weight = valueWeights.get(value);
            List<Integer> item = new ArrayList<>();
            item.add(value);
            item.add(weight);
            retList.add(item);
        }

        // Sort the list by value
        retList.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        return retList;
    }

    private void processItems(int[][] items, Map<Integer, Integer> valueWeights) {
        for (int[] item : items) {
            int value = item[0];
            int weight = item[1];
            valueWeights.put(value, valueWeights.getOrDefault(value, 0) + weight);
        }
    }

    public static void main(String[] args) {
        MergeSimilarItems merger = new MergeSimilarItems();

        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};
        List<List<Integer>> output1 = merger.mergeSimilarItems(items1, items2);
        printList(output1);

        int[][] items3 = {{1, 1}, {3, 2}, {2, 3}};
        int[][] items4 = {{2, 1}, {3, 2}, {1, 3}};
        List<List<Integer>> output2 = merger.mergeSimilarItems(items3, items4);
        printList(output2);

        int[][] items5 = {{1, 3}, {2, 2}};
        int[][] items6 = {{7, 1}, {2, 2}, {1, 4}};
        List<List<Integer>> output3 = merger.mergeSimilarItems(items5, items6);
        printList(output3);
    }

    private static void printList(List<List<Integer>> list) {
        for (List<Integer> item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
