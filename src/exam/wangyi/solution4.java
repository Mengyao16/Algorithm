package Algorithm.exam.wangyi;

import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        if(n==1) System.out.println(a);
        if(n==2) System.out.println(b);
        long first = a;
        long second = b;
        for (int i = 0; i < n-2; i++) {
            long tmp = (long) ((long)first*second *first*second %((1e+9)+7));
            first = second;
            second = tmp;
        }
        System.out.println((int)(second%((1e+9)+7)));


    }
}
