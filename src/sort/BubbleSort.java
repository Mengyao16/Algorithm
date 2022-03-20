package Algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        //bubbleSortRecursiveImplementation(array,array.length);

        System.out.println(Arrays.toString(array));

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
}
