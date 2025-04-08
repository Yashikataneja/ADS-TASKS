import java.util.*;

class leetcode215 {
    public int findKthLargest(int[] nums, int k) {
        return solve(nums,k);
    }
    public int solve(int[]arr,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>=pq.peek()){
                pq.add(arr[i]);
                pq.poll();
            }
        }
        return pq.poll();
    }
}