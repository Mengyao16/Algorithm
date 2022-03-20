package Algorithm.sort;


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
    public static void heapSort(int[] array){
        int length = array.length;
        //步骤1：建大根堆，
        //第一个非叶结点为 length / 2 - 1
        for (int i = length / 2 -1; i >0 ; i--) {
            siftDown(array,i,length);
        }

    }
    private static void siftDown(int[] array,int parent,int length){

        // 重要性质2：左子树为 2 * parent + 1，右子树为 2 * parent + 2
        int left = 2 * parent + 1 ,right = 2 * parent + 2 ;
        int maxIndex = parent;

        if(left < length){


        }

    }



}
