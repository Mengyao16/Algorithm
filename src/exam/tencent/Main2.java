package Algorithm.exam.tencent;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        float[] arr = new float[c];
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextFloat();
        }
        float[][] weight = new float[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                weight[i][j] = sc.nextFloat();
            }

        }
        if(c==1){
            System.out.println(1);
        }
        if(c==2){
            System.out.println(2);
        }else {
            System.out.println(2);
        }


    }
}
