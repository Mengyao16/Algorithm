package Algorithm.exam.wangyi;

import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int bit = 1;
        int[] count = new int[32];
        for(int a :arr){
            for (int i = 31; i >=0; i--) {
                int tmp = a & (bit<<i);
                if(tmp>0){
                    count[i]++;
                }

            }
        }
        for (int i = 31; i >= 0; i--) {
            if(count[i]>=k){
                System.out.println((int)bit<<i);
                return;
            }
        }
        System.out.println(0);

    }
}
