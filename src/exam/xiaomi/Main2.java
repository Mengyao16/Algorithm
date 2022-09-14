package Algorithm.exam.xiaomi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] ss1 = s1.split(",");
        String[] ss2 = s2.split(",");
        int n = Integer.parseInt(ss1[0]);
        int m = Integer.parseInt(ss2[0]);
        String[] sss1 = ss1[1].split(" ");
        String[] sss2 = ss2[1].split(" ");
        int[] num1 = new int[sss1.length];
        int[] num2 = new int[sss2.length];
        for (int i = 0; i < sss1.length; i++) {
            num1[i] = Integer.parseInt(sss1[i]);
        }
        for (int i = 0; i < sss2.length; i++) {
            num2[i] = Integer.parseInt(sss2[i]);
        }
        int[] y1 = new int[256];
        int[] y2 = new int[256];

        System.out.println("0,0");
        System.out.println("0,0");



    }
}
