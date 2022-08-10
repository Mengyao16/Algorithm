package Algorithm.exam.tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int c = arr[i][2];
            double l = 0.0,r = 100000000.0;
            while(r>l){
                double mid = (l+r) / 2 ;
                double y = Math.pow(mid,3) + a*Math.pow(mid,2)+b*mid;
                if(Math.abs(y-c)<=Math.pow(10,-5)){
                    System.out.println(mid);
                    break;
                }else if(y<c){
                    l = mid;
                }else{
                    r = mid;
                }
            }

        }


    }
}
