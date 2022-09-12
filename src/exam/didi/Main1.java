package Algorithm.exam.didi;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double sum = 0;
        int res = 1;
        int right = 0;
        int left = 0;
        while(right <n && left <n){
            double tmp = (sum + (double)a[right]) /(double)(right - left +1) * k;
            if(tmp>=(double)a[right]){
                res = Math.max(right - left +1,res);
                sum = sum + a[right];
                right++;
            }else{
                sum = sum - a[left];
                left++;
            }
        }
        System.out.println(res);


    }
}
