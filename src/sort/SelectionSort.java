package Algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    /*
    * 平均时间复杂度：O(N^2)
    * 最佳时间复杂度：O(N^2)
    * 最差时间复杂度：O(N^2)
    * 空间复杂度：O(1)
    * 排序方式：In-place
    * 稳定性：不稳定
    * */
    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length ; i++) {
            int min_index = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[min_index]>array[j]) min_index = j;
            }
            if(min_index != i){
                int tmp = array[min_index];
                array[min_index] = array[i];
                array[i] = tmp;
            }

        }
    }
}
