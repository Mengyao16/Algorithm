package Algorithm.leetcode.lc0200;

import java.util.Comparator;
import java.util.PriorityQueue;

public class lc215 {
    //数组中的第k个最大元素
    //快排
    public int findKthLargest(int[] nums, int k) {

        int index = quickSort( nums,0,nums.length-1,k);
        return nums[index];

    }
    public int quickSort(int[] nums,int low,int high,int k){
        int index = patrition(nums, low,high);
        if(index == nums.length - k ) return index;
        if(index>nums.length - k){
            index = quickSort(nums,low,index-1,k);
        }else{
            index = quickSort(nums,index+1,high,k);
        }
        return index;



    }
    public int patrition(int[] nums,int low,int high){
        int pivot = nums[low];
        while(low<high){
            while(low<high && nums[high]>=pivot){
                high--;
            }
            if(low<high){
                nums[low++] = nums[high];
            }
            while(low<high && nums[low]<pivot){
                low--;
            }
            if(low<high){
                nums[high--] = nums[low];
            }
        }
        nums[low] = pivot;
        return low;

    }
    //使用堆排序
    public int findKthLargest2(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int num :nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }

        }
        return pq.peek();

    }

}
