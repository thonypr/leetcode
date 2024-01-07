import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set seeks = new HashSet();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                char item = board[i][j];
                if(item != '.' &&
                        (!seeks.add(item + " row " + i) ||
                                !seeks.add(item + " column " + j) ||
                                !seeks.add(item + " cell " + i/3 + " " + j/3)))
                    return false;
            }
        }

        return true;
    }
}
