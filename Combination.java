import java.util.ArrayList;
import java.util.List;

public class Combination {
    private int n;
    private int k;
    public List<List<Integer>> combination(int n,int k){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, 1, new ArrayList<Integer>());
        return result;
    }
    public void backtrack(List<List<Integer>> result, int start, ArrayList<Integer> temp){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(result, start+1, temp);
            temp.remove(temp.size()-1);
        }

    }
}