package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> getPermutations(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), nums,result);
        return result;
    }
    public void backtrack(List<Integer> temp, int[] nums,List<List<Integer>> result){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(!temp.contains(num)){
                temp.add(num);
                backtrack(temp, nums, result);
                temp.remove(temp.size()-1);
            }
        }
    }
    
}
