package Algorithm.exam.baidu;

import java.util.*;
public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.charAt(0) - '0';
        for (int i = 0; i < n; i++) {
            int j=0;
            while((j+1<s.length())&&s.charAt(j)>=s.charAt(j+1)){
                j++;
            }
            s = s.substring(0,j) + s.substring(j+1);

        }
        System.out.println(s);
    }
}
