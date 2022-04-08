package Algorithm.nowcoder.top101;

import java.util.PriorityQueue;

public class BM46 {
    //最小的k个数
    //leetcode 剑指offer40
    public int[] getLeastNumbers(int[] arr,int k){
        int[] res = new int[k];
        if(k==0) return res;
        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> o2-o1));
        for (int i = 0; i < k; i++) {
            pq.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.offer(arr[i]);
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;

    }
}
