import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }

        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, visited, new StringBuilder(), wordSet, result);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int i, int j, boolean[][] visited, StringBuilder current, Set<String> wordSet, List<String> result) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) {
            return;
        }

        current.append(board[i][j]);
        String currentStr = current.toString();

        if (wordSet.contains(currentStr)) {
            result.add(currentStr);
            wordSet.remove(currentStr); // Avoid duplicate results
        }

        visited[i][j] = true;

        // Explore adjacent cells
        dfs(board, i + 1, j, visited, current, wordSet, result);
        dfs(board, i - 1, j, visited, current, wordSet, result);
        dfs(board, i, j + 1, visited, current, wordSet, result);
        dfs(board, i, j - 1, visited, current, wordSet, result);

        visited[i][j] = false;
        current.deleteCharAt(current.length() - 1);
    }

    public static void main(String[] args) {
        WordSearch solution = new WordSearch();

        // Example 1
        char[][] board1 = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String[] words1 = {"oath", "pea", "eat", "rain"};
        List<String> result1 = solution.findWords(board1, words1);
        System.out.println("Example 1: " + result1);

        // Example 2
        char[][] board2 = {
            {'a', 'b'},
            {'c', 'd'}
        };
        String[] words2 = {"abcb"};
        List<String> result2 = solution.findWords(board2, words2);
        System.out.println("Example 2: " + result2);
    }
}
