package Algorithm.nowcoder.top101;
import java.util.*;

public class BM45 {
    //滑动窗口的最大值
    //leetcode 239
    public  int[] maxSlidingWindow(int[] nums ,int k){
        int n = nums.length;
        Queue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1];
            }
        });
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i],i});
        }
        int[] ans = new int[n-k+1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i],i});
            while(pq.peek()[1]<=i-k){
                pq.poll();
            }
            ans[i-k+1] = pq.peek()[0];
        }
        return ans;
    }

    //单调队列
    public int[] maxSlidingWindow2(int[] nums ,int k){
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] ans = new int[n-k+1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; i++) {
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            while(deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            ans[i-k+1] = nums[deque.peekFirst()];
        }
        return ans;
    }
}
