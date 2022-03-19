package Algorithm;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class sort{
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        //bubbleSort(array);
        bubbleSortRecursiveImplementation(array,array.length);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }

    }
    /*
    * 冒泡排序
    * 空间复杂度O(1) 时间复杂度 average O(n*n)  best O(n) worst O(n*n)
    * */
    public static void bubbleSort(int[] array) {

        int tmp = 0 ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }

        }

    }
    //recursive implementation

    public static void bubbleSortRecursiveImplementation(int[] array ,int n){
        if(n==1) return ;
        boolean swap_flag = false;
        for (int i = 0; i < n-1; i++) {
            if(array[i]>array[i+1]){
                int tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
                swap_flag = true;
            }
        }
        if(swap_flag==false) return ;
        bubbleSortRecursiveImplementation(array,n-1);

    }

    /*
    * 快速排序 divide and conquer 分治
    * worst:time complexity of O(n^2) ,outputs 2 sub arrays with a large difference in terms of array sizes
    * best:O(nlog(n)) when the selection of pivot divides original array into two nearly equal sized sub arrays
    * step 1.Choose an element to serve as a pivot
    * step 2.all elements less than the pivot are to the left, and all elements greater than the pivot are to the right.
    * step 3.Call Quicksort recursively
    */
    public static void quickSort(int[] array, int low ,int high){
        if(low>=high) return ;
        int pivot = array[low];
        int i = low,j = high;
        while(i<j){
            while(arr[j]>=pivot&&i<j){
                j--;
            }
            while(arr[i]<=pivot&&i<j){
                i++;
            }
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }


    }
}