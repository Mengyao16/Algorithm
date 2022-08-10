package Algorithm.exam.tencent;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] pi  = new double[m];
        for (int i = 0; i < m; i++) {
            pi[i] = sc.nextDouble();
        }
        int sum = n;
        for (int i = 0; i < m; i++) {
            //不跟注百分百丢掉sum
            //最大跟住
            //x+sum  * (1.0-pi[i])
            int temp = (int) (sum / (1.0-pi[i])) - sum-20;
            for (int j = 0; j < 40; j++) {


                if((sum +temp+j)*(1.0-pi[i])-sum >=-1e-6){
                    temp = temp+j-1;
                    break;
                }
            }
            sum = sum + temp ;

        }
        System.out.println(sum);
    }
}
