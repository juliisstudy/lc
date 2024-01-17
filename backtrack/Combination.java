import java.util.ArrayList;
import java.util.List;

public class Combination {
    
    public List<List<Integer>> combine(int n,int k){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, 1, new ArrayList<Integer>(),n,k);
        return result;
    }
    public void backtrack(List<List<Integer>> result, int start, ArrayList<Integer> temp,int n, int k){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(result, i+1, temp,n,k);
            temp.remove(temp.size()-1);
        }

    }
}