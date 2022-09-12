package Algorithm.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class lc347 {
    //前k个高频元素
    //给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //此处还可以使用快排算法
        PriorityQueue<int[]> pq  = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(int key :map.keySet()){
            if(pq.size()<k){
                pq.add(new int[]{key,map.get(key)});
            }else{
                if(map.get(key)>pq.peek()[1]){
                    pq.poll();
                    pq.add(new int[]{key,map.get(key)});
                }
            }
        }
        int[] res  = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            res[i] = pq.poll()[0];
            i++;
        }
        return res;
    }

}
