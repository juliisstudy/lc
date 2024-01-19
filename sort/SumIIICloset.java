package sort;

import java.util.Arrays;

public class SumIIICloset {
    public int close(int[] nums, int target){
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length&&diff!=0;i++){
            int low = i+1;
            int hi = nums.length-1;
            while (low<hi) {
                int sum = nums[i]+nums[low]+nums[hi];
                if(Math.abs(target-sum)<Math.abs(diff)){
                    diff = target - sum;
                }
                if(sum<target){
                    low++;
                }else{
                    hi--;
                }
            }
        }
        return target-diff;
    }
}
