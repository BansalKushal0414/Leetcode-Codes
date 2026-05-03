class Solution {
    public boolean track(char[][] board, String word, int i, int j, int m, int n, int idx) {
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(idx)) {
            return false;
        }

        if (idx == word.length() - 1) {
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '.';

        boolean found = 
            track(board, word, i + 1, j, m, n, idx + 1) ||
            track(board, word, i - 1, j, m, n, idx + 1) ||
            track(board, word, i, j + 1, m, n, idx + 1) ||
            track(board, word, i, j - 1, m, n, idx + 1);

        board[i][j] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j]) {
                    if (track(board, word, i, j, m, n, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}