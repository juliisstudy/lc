package backtrack;
import java.util.HashSet;
import java.util.Set;

public class NQueensII {
    private int size;
    public int totalNQueens(int n){
        size = n;
        return backtrack(0,new HashSet<>(),new HashSet<>(),new HashSet<>());
    }
    private int backtrack(int row, Set<Integer> diagonals, Set<Integer> antiDiagonals, Set<Integer> cols){
        if(row==size){
            return 1;
        }
        int solution = 0;
        for (int col=0;col<size;col++){
            int currDiagonal = row - col;
            int currAntiDiagonal = row+col;
            if(cols.contains(col)||diagonals.contains(currDiagonal)||antiDiagonals.contains(currAntiDiagonal)){
                continue;
            }
            cols.add(col);
            diagonals.add(currDiagonal);
            antiDiagonals.add(currAntiDiagonal);
            solution+=backtrack(row+1, diagonals, antiDiagonals, cols);
            cols.remove(col);
            diagonals.remove(currDiagonal);
            antiDiagonals.remove(currAntiDiagonal);
        }
        return solution;
    }
}
