package Algorithm.exam.jd;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        long n = sc.nextLong();
        if(n<6) System.out.println(0);
        else if(n==6) System.out.println(1);
        else{
            long a = 1;
            for (int i = 0; i < n-6; i++) {
                a = a * 26 % 1000000007;
            }
            //int  a  = (int) Math.pow(26,n-6) * ((n-5) * (n-6)/2 + n-5) % 1000000007;
            //long a = (long) Math.pow(26,n-6) % 1000000007;
            long b = (((n-5) * (n-6)/2)  + n-5) % 1000000007;
            a = a * b % 1000000007;

            System.out.println(a);

        }

    }
}
