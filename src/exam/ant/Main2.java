package Algorithm.exam.ant;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int[] anss = new int[n];

        int count = 1;
        for (int i = 1; i < n; i++) {
            if(a[i]>a[i-1]){
                count++;

            }else{
                for (int j = 0; j < count; j++) {
                    anss[i]++;
                }
                ans[count-1]++;
                count = 1;
            }
        }
        //for(int i = n-2;i>=0;i--){
        //    ans[i] = ans[i] + 2* ans[i+1];
        //}
        //int[] anss = new int[n];
        //for (int i = 0; i < n; i++) {
        //    for(int j = i;j<n;j++){
        //        anss[i] = anss[i] + (j-i+1)* ans[j];
        //    }
        //}
        anss[0]++;



        for (int i = 0; i < n; i++) {
            System.out.print(anss[i]);
            System.out.print(' ');
        }
    }
}
