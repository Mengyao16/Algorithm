package Algorithm.exam.ant;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int count = 0;
            for (int j = 2; j < Math.pow(num,0.5); j++) {
                while(num%j==0){
                    count++;
                    num = num /j;
                }
                if(num==1){
                    break;
                }
            }
            if(num!=1){
                count++;
            }
            if(count%2==0){
                System.out.println("yukari");
            }else{
                System.out.println("kou");
            }

        }
    }
}
