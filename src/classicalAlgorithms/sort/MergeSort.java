package Algorithm.classicalAlgorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random g = new Random();
        int[] array = new int[10];
        int[] temp = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = g.nextInt(0,10);
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array,temp,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
    /*
    * 分解：将n个元素分成个含n/2个元素的子序列
    * 解决：用合并排序法对两个子序列递归的排序
    * 合并：合并两个一排序子序列的已排序结果
    * 时间复杂度：平均 O(nlogn) 最坏 O(nlogn) 最好 O(nlogn)
    *   空间复杂度：O(n)
    *   稳定排序
    * 记忆：使用辅助数组，归并左，归并右，合并左右
    *
    * */

    public static void mergeSort(int[] array,int[] temp, int left,int right){

        if(left <= right){
            return;
        }
        int mid = left + (right -left)/2;
        mergeSort(array,temp,left,mid);
        mergeSort(array,temp,mid+1,right);
        //如果左数组的结尾位置小于右数组的开头，不需要merge
        if(array[mid]<=array[mid+1]){
            return ;
        }
        merge(array,temp,left,mid,right);

    }
    public static void merge(int[] array,int[] temp,int left,int mid,int right){
        //i是左数组的起始位置，j是右数组的起始位置
        //mid是左数组的结尾位置，right是右数组的结尾位置
        int i = left,j = mid+1;
        for(int k = left ; k<=right;k++){
            if(i== mid +1){
                temp[k] = array[j];
                j++;
            }else if(j ==right+1){
                temp[k] = array[i];
                i++;
            } else if(array[i]<=array[j]){
                temp[k] = array[i];
                i++;
            }else {
                temp[k] = array[j];
                j++;
            }
        }
        System.arraycopy(temp,left,array,left,right-left+1);

    }

}
