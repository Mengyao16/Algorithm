package Algorithm.exam.tme;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class main2 {
    public int minMax (ArrayList<Integer> a, int k, int x) {
        // write code here
        Queue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        for (int i:
             a) {
            queue.offer(i);

        }
        for (int i = 0; i < k; i++) {
            queue.offer(queue.poll()-x);
        }
        return queue.poll();
    }
}
