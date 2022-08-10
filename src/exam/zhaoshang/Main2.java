package Algorithm.exam.zhaoshang;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int start = 0;
        int end = k;
        LinkedList<Integer> queue = new LinkedList<>();
        int j = 0;
        int ans = 0;
        while (j<n) {

            while(j<n&&a[j]<=end){
                queue.offer(a[j]);
                j++;
            }
            while(queue.peek()<start){
                queue.poll();
            }
            ans = Math.max(ans,queue.size());

            if(j<n){
                end = a[j];
                start = a[j]-k;
            }


        }
        System.out.println(n-ans);


    }
}
