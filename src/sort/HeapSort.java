package Algorithm.sort;


import java.util.Arrays;
import java.util.Random;

/*
堆排序
利用堆这种数据结构所设计的一种排序算法。
堆：近似完全二叉树的结构，父节点的值总是大于（或小于）它的子节点。
时间复杂度：平均 O(nlogn) 最坏 O(nlogn) 最好 O(nlogn)
空间复杂度：O(1)
不稳定排序
从小到大排时记忆：从第一个非叶结点往左，调整下沉该节点
               头节点为最大值，和尾节点交换，下沉头节点。长度减一循环
*/
public class HeapSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void heapSort(int[] array){
        int length = array.length;
        //步骤1：建大根堆，
        //第一个非叶结点为 length / 2 - 1
        for (int i = length / 2 -1; i >=0 ; i--) {
            siftDown(array,i,length);
        }

        //步骤2:交换和调整
        for (int i = length-1; i > 0; i--) {
            swap(array,0,i);
            //交换后会破坏节点的子结构，调整，注意length变
            siftDown(array,0,i);
        }

    }
    private static void siftDown(int[] array,int parent,int length){

        // 重要性质2：左子树为 2 * parent + 1，右子树为 2 * parent + 2
        int left = 2 * parent + 1 ,right = 2 * parent + 2 ;
        int maxIndex = parent;

        if(left < length&& array[left] > array[maxIndex]){
             maxIndex = left;

        }
        if(right < length && array[right] > array[maxIndex]){
            maxIndex = right;
        }
        if(maxIndex != parent) {
            swap(array, maxIndex, parent);
            //递归后可能会破坏子节点的结构，递归被交换的子节点
            siftDown(array,maxIndex,length);
        }
    }
    private static void swap(int [] array ,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
