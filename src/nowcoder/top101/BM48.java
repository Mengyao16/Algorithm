package Algorithm.nowcoder.top101;

import java.util.PriorityQueue;

public class BM48 {
    //数据流的中位数
    //leetcode 295
    //使用两个优先队列来维护数据流的中位数
    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;

    public BM48(){
        queMin = new PriorityQueue<>((a,b)->(b-a));
        queMax = new PriorityQueue<>((a,b)->(a-b));

    }
    public void addNum(int num){
        if(queMin.isEmpty()||num<= queMin.peek()){
            queMin.offer(num);
            if(queMax.size()+1< queMin.size()){
                queMax.offer(queMin.poll());
            }
        }else{
            queMax.offer(num);
            if(queMax.size()>queMin.size()){
                queMin.offer(queMax.poll());
            }
        }


    }

    public double findMedian() {
        if(queMin.size()>queMax.size()){
            return queMin.peek();
        }else{
            return (queMax.peek()+ queMin.peek()) / 2.0;
        }

    }
}
