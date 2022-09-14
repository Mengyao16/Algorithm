package Algorithm.exam.baidu;


import java.util.LinkedList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//人数
        int m = sc.nextInt();//操作
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[][] op = new int[m][2];
        for (int i = 0; i < m; i++) {
            op[i][0] = sc.nextInt();
            op[i][1] = sc.nextInt();
        }
        LinkedList<int[]> stack = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            if(stack.isEmpty()){
                stack.push(op[i]);
                continue;
            }
            while(!stack.isEmpty() && stack.peek()[1]<op[i][1]){
                stack.pop();
            }
            stack.push(op[i]);


        }
        int flag = 0;
        while(!stack.isEmpty()){
            int[] tmp = stack.pollLast();
            if(tmp[0]==1){
                if(flag ==1) continue;
                quickSort_up(h,0,tmp[1]-1);
                flag = 1;
            }else{
                if(flag==2) continue;
                flag = 2;

                quickSort_up(h,0,tmp[1]-1);
                int low = 0;
                int high = tmp[1]-1;
                while(low<high){
                    int a  = h[low];
                    h[low] = h[high];
                    h[high]   = a;
                    high--;
                    low++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(h[i]);
            System.out.print(' ');
        }


    }
    public static void quickSort_up(int[] array, int low ,int high){
        if(low < high) {
            int index = getSplitIndex(array, low, high);
            quickSort_up(array, low, index - 1);
            quickSort_up(array, index + 1, high);
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

}
