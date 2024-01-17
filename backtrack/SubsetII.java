import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public List<List<Integer>> subsetWithDup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        subsetHelper(subsets,new ArrayList<Integer>(), nums,0);
        return subsets;
    }

    private void subsetHelper(List<List<Integer>> subsets,List<Integer> curr,int[] nums,int index){
        subsets.add(new ArrayList<>(curr));
        for(int i= index;i<nums.length;i++){
            if(i!=index&&nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            subsetHelper(subsets,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
