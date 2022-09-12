package Algorithm.exam.pinduodouo;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();//包含#
        String t = sc.next();//不包含#
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==0){
                flag=0;
            }
        }
        System.out.println(s);
    }
}
