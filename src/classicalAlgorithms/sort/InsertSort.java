package Algorithm.classicalAlgorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println("insert");
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }
    /*
    * 插入排序（简单插入排序）
    * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
    * 时间复杂度：平均 O(n^2) 最坏 O(n^2) 最好 O(n)
    * 空间复杂度：O(1)
    * 稳定排序
    * */
    public static void insertSort(int[] array){
        int length = array.length;
        //从1开始
        for (int i = 1; i < length ; i++) {
            int insert = array[i];
            int pre = i-1;
            while(pre>=0 &&array[pre]>insert){
                array[pre+1] = array[pre];
                pre--;
            }
            array[pre +1] = insert;
        }


    }
}
