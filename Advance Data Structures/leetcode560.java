import java.util.HashMap;

public class leetcode560 {
    // given an array of integers nums and an integer k,
    //return the total no. of contiguous sub arrays whose sum is equal to k;

    /* nums=[1,2,3] , k=3;
     * //output : 2
     * 
     */

     public static int subarraysum(int[]nums,int k){
        HashMap<Integer,Integer>pSM=new HashMap<>();
        pSM.put(0,1); //to count subarrays that sum up to k from the following
        int count=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
            //if (sum-k) exists karta hai map mein, we found subarray that ends  at cureent index and sums to k.
            if(pSM.containsKey(sum-k)){
                count+=pSM.get(sum-k);
            }
            pSM.put(sum,pSM.getOrDefault(sum,0)+1);
        }
        return count;
        
     }
     public static void main(String[] args) {
         int[]nums={1,2,3};
         int k=3;
         int res=subarraysum(nums,k);
         System.out.println("total no.of subarrays with sum ="+k+" is "+res);
     }
    
}
