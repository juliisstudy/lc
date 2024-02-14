package dp;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int result = max;

        for( int i =1;i<nums.length;i++){
            int curr = nums[i];
            int temp_max = Math.max(curr,Math.max(max*curr,min*curr));
             min = Math.min(curr,Math.min(max*curr,min*curr));
             max = temp_max;
             result = Math.max(max,result);
        }
        return result;
    }
}
