package Algorithm.exam.jd;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = new int[n][n];
        int even = 2;
        int odd = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j)%2==0){
                    res[i][j] = odd;
                    odd = odd +2;
                }else{
                    res[i][j] = even;
                    even = even +2;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]);
                if(j!=n-1){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }


            }

        }

    }
}
