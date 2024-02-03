package sort;
public class removeDuplicate {
    public int remove(int[] nums){
        int p =0;
        for(int i =1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[p]=nums[i];

                p++;
            }
        }
        return p;
    }
}
