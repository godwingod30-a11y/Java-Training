class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Iterate through every cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the first character matches, start DFS
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, int count, String word) {
        // Base case: If we have matched all characters in the word
        if (count == word.length()) {
            return true;
        }

        // Check bounds and if the current cell matches the required character
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
            return false;
        }

        // Mark the current cell as visited by storing its value and replacing it with a
        // special character
        char temp = board[i][j];
        board[i][j] = '#';

        // Recursively search in all 4 directions (down, up, right, left)
        boolean found = dfs(board, i + 1, j, count + 1, word) ||
                dfs(board, i - 1, j, count + 1, word) ||
                dfs(board, i, j + 1, count + 1, word) ||
                dfs(board, i, j - 1, count + 1, word);

        // Backtrack: Restore the cell's original value
        board[i][j] = temp;

        return found;
    }
}