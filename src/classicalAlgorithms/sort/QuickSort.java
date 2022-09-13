package Algorithm.classicalAlgorithms.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println(Arrays.toString(array));
        //bubbleSort(array);
        //bubbleSortRecursiveImplementation(array,array.length);
        quickSort2(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
    /*
    * 快速排序 divide and conquer 分治
    * worst:time complexity of O(n^2) ,outputs 2 sub arrays with a large difference in terms of array sizes
    * best:O(nlog(n)) when the selection of pivot divides original array into two nearly equal sized sub arrays
    * step 1.Choose an element to serve as a pivot
    * step 2.all elements less than the pivot are to the left, and all elements greater than the pivot are to the right.
    * step 3.Call Quicksort recursively
    * 分割算法：取最左边的数为基数，也就是分割点（保存它，并挖坑）
                      从右向左找第一个小于基准的数，填入坑中，该数位置为新坑
                      从左向右找第一个大于等于基准的数，填入坑中，该数位置为新坑
                      直到 l >= r，此时分割点为 l，把基准填入
    */
    public static void quickSort(int[] array, int low ,int high){
        if(low < high) {
            int index = getSplitIndex(array, low, high);
            quickSort(array, low, index - 1);
            quickSort(array, index + 1, high);
        }
    }
    private static int getSplitIndex(int[] array,int low,int high){
        int pivot = array[low];
        while(low<high){
            //从右向左找第一个小于pivot的数
            while(low<high&&array[high]>=pivot){
                high--;
            }
            if(low<high){
                array[low++]  = array[high];
            }
            while(low<high&&array[low]<pivot){
                low++;
            }
            if(low<high){
                array[high--]  = array[low];
            }
        }
        array[low] = pivot;
        return low;
    }

    /*
     * 非递归version
     * */

    public static void quickSort2(int[] array,int left,int right) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(right);
        stack.push(left);
        while(!stack.isEmpty()){
            int l = stack.pop();
            int r = stack.pop();
            int index = getSplitIndex(array,l,r);
            if(l < index - 1){
                stack.push(index-1);
                stack.push(l);
            }
            if(index + 1 < r){
                stack.push(r);
                stack.push(index+1);
            }
        }
    }
}
