package pointer;

public class TwoSumSorted {
    public int[] twoSumSorted(int[] nums,int target){
        int l=0;
        int r = nums.length-1;
        while(nums[l]+nums[r]!=target){
            if(nums[l]+nums[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{l+1,r+1};
    }
}
