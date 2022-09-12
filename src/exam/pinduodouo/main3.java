package Algorithm.exam.pinduodouo;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();

        }

        int q = sc.nextInt();
        int[][] intervals = new int[q][2];
        for (int i = 0; i < q; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < q; i++) {
            int start = 0;
            int end = a.length;
            int target = intervals[i][0];
            while(start<=end){
                int mid = (start+end)/2;
                if(a[mid]==target){
                    while(mid<=intervals[i][1]&&a[mid]==target){
                        mid ++;
                    }


                    break;
                }else if(a[mid]>target&&a[mid-1]<target){
                    System.out.println(target);
                    break;
                }else if(a[mid]<target){
                    start = mid +1;
                }else {
                    end = mid -1;
                }
            }


        }
    }

}
