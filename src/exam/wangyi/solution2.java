package Algorithm.exam.wangyi;

import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()<3) System.out.println(0);
        int res = 0;
        for (int j = 1; j <= s.length()/3; j++) {


            int numr = 0;
            int nume = 0;
            int numd = 0;
            for (int i = 0; i < 3*j; i++) {
                if (s.charAt(i) == 'r') numr++;
                if (s.charAt(i) == 'e') nume++;
                if (s.charAt(i) == 'd') numd++;
            }
            int left = 0;
            int right = 3*j-1;


            while (right < s.length()) {
                if (numr == numd && numd == nume) {
                    res++;
                }
                if (s.charAt(left) == 'r') numr--;
                if (s.charAt(left) == 'e') nume--;
                if (s.charAt(left) == 'd') numd--;
                left++;
                right++;
                if (right < s.length()) {
                    if (s.charAt(right) == 'r') numr++;
                    if (s.charAt(right) == 'e') nume++;
                    if (s.charAt(right) == 'd') numd++;
                }

            }
        }
        System.out.println(res);



    }

}
