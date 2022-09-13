package Algorithm.classicalAlgorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println("insert");
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void shellSort(int[] array){
        int len = array.length;
        for (int gap = len / 2;gap>0;gap = gap / 2){
            for (int i = gap ;i<len;i++){
                int insert = array[i];
                int pre = i - gap;
                while(pre>=0 && array[pre] > insert){
                    array[pre + gap] = array[pre];
                    pre -= gap;
                }
                array[pre+gap] = insert;
            }

        }
    }
}
