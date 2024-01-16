import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    
    private int size;
    private List<List<String>> result= new ArrayList<>();

    public List<List<String>> solveNQueens(int n){
        size = n;
        char emptyBoard[][]=new char[size][size];
        for(int i = 0;i<size;i++){
            for(int j = 0;i<size;i++){
                emptyBoard[i][j]='.';
            }
        }
        backtrack(n, new HashSet<>(),new HashSet<>(),new HashSet<>(),emptyBoard);
        return result;
    }

    private List<String> createBoard(char[][] state){
        List<String> board = new ArrayList<String>();
        for(int row = 0;row<size;row++){
            String current_row = new String(state[row]);
            board.add(current_row);
        }
        return board;
    }
    private void backtrack(int row, Set<Integer> diagonals,Set<Integer> antiDiagonals,Set<Integer> cols,char[][] state){
        if(row==size){
            result.add(createBoard(state));
            return;
        }
        for(int col = 0;col<size;col++){
            int currDiagonal = row - col;
            int currAntiDiagonal = row+col;

            if(cols.contains(col)||diagonals.contains(currDiagonal)||antiDiagonals.contains(currAntiDiagonal)){
                continue;
            }

            cols.add(col);
            diagonals.add(currDiagonal);
            antiDiagonals.add(currAntiDiagonal);
            state[row][col]='Q';

            backtrack(row+1, diagonals, antiDiagonals, cols, state);
            cols.remove(col);
            diagonals.remove(currDiagonal);
            antiDiagonals.remove(currAntiDiagonal);
            state[row][col]='.';

        }
    }


}
