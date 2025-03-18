import java.util.HashMap;
import java.util.Map;
public class problem560 {
        public static int subarraysum(int[]nums,int k){
            Map<Integer,Integer>pSC=new HashMap<>();
            pSC.put(0,1);
            int preSum=0,co=0;
            for(int num:nums){
                preSum+=num;
                if(pSC.containsKey(preSum-k)){
                    co+=pSC.get(preSum-k);
                }
                pSC.put(preSum,pSC.getOrDefault(preSum,0)+1);
            }
            return co;
        }
        public static void main(String[] args) {
            int[]nums={1,1,1};
            int k=2;
            System.out.println(subarraysum(nums,k));
        }
}
