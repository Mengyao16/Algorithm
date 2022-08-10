package Algorithm.exam.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        long res = 0;
        int[] cnt = new int[26];
        for (int l = 0; l < s.length()-1; l++) {
            if(l>0){
                cnt[s.charAt(l-1)-'a'] +=1;
                if(cnt[s.charAt(l-1)-'a']>k){
                    break;
                }
            }
            int[] tmp = Arrays.copyOf(cnt,26);
            for (int r = s.length(); r > l; r--) {
                if(r<s.length()){
                    tmp[s.charAt(r)-'a'] += 1;
                    if(tmp[s.charAt(r)-'a']>k){
                        break;
                    }
                }
                res++;
            }
        }
        System.out.println(res-1);
    }
}
