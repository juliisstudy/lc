package sort;

import java.util.PriorityQueue;

public class KthLargestElementArray {
    public int findKthLargest(int[] nums, int k){
      PriorityQueue<Integer>heap = new PriorityQueue<>();
      for(int num:nums){
        heap.add(num);
        if(heap.size()>k){
            heap.remove();
        }
      }
      return heap.peek();
    }
}
