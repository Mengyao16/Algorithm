package Algorithm.exam.wangyi;

import java.util.Scanner;
/*
1
3 1 1
 */
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[t][3] ;
        for (int i = 0; i < t; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();

        }
        for (int i = 0; i < t; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int c = arr[i][2];
            double l = 0.0,r = 100000000.0;
            while(r-l>Math.pow(10,-9)){
                double mid = (l+r) / 2 ;
                double y = a*Math.sqrt(mid)+b*Math.log(mid);
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
