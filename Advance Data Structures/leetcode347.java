import java.util.*;

class Pair {
    int num;
    int freq;

    Pair(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}

public class leetcode347 {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count frequency of each number
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.freq - p1.freq; // Max heap
            }
        });

        for (int i : map.keySet()) {
            pq.add(new Pair(i, map.get(i)));
        }

        // Step 3: Extract top k frequent elements
        int[] ans = new int[k];
        int idx = 0;
        while (idx < k && !pq.isEmpty()) {
            ans[idx++] = pq.poll().num;
        }

        return ans;
    }

    // For testing
    public static void main(String[] args) {
        leetcode347 obj = new leetcode347();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = obj.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
