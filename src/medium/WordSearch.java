package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearch {

    private static final int[][] DIRS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int k = 0; k < board[0].length; k++) {
                if((board[i][k] == word.charAt(0)) && exist(board, i, k, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int i, int k, int count, String word) {
        if (count == word.length()) {
            return true;
        }

        if(i == -1 || i == board.length || k == -1 ||
                k == board[0].length ||
                board[i][k] != word.charAt(count)) {
            return false;
        }

        var temp = board[i][k];
        board[i][k] = ' ';
        var found = false;

        for(var dir : DIRS) {
            if(exist(board, i + dir[0], k + dir[1], count + 1, word)) {
                found = true;
                break;
            }
        }

        board[i][k] = temp;
        return found;
    }

    @Test
    public void test() {
        char[][] arrs =  new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assertions.assertEquals(true, exist(arrs, "ABCCED") );
    }
}
