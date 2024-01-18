package backtrack;
import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n){
       List<String> list = new ArrayList<String>();
       backtrack("", list, n, 0, 0);
       return list;
    }
    public void backtrack(String temp, List<String> list, int n, int open, int close){
        if(temp.length()==n*2){
            list.add(temp);
            return;
        }
        if(open<n){
            backtrack(temp+"(", list, n, open+1, close);
        }
        if(close<open){
            backtrack(temp+")", list, n, open, close+1);
        }
    }
}