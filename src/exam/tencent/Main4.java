package Algorithm.exam.tencent;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[][] interval = new int[q][2];
        for (int i = 0; i < q; i++) {
            interval[i][0] = sc.nextInt();
            interval[i][1] = sc.nextInt();
        }
        int[] sum = new int[q];
        for (int red:
             a) {
            for (int i = 0; i < q; i++) {
                if(red>=interval[i][0]&&red<=interval[i][1]){
                    sum[i] = sum[i] +1;
                }
            }
        }
        for (int blue:
                b) {
            for (int i = 0; i < q; i++) {
                if(blue>=interval[i][0]&&blue<=interval[i][1]){
                    sum[i] = sum[i] - 1;
                }
            }
        }
        int[] res = new int[3];
        for (int i = 0; i < q; i++) {
            if(sum[i] >0){
                res[0] +=1;

            }else if(sum[i]==0){
                res[1] +=1;
            }else{
                res[2]+=1;
            }
        }
        System.out.print(res[0]);
        System.out.print(' ');
        System.out.print(res[1]);
        System.out.print(' ');
        System.out.println(res[2]);

    }
}
