package Algorithm.exam.pinduodouo;

import java.util.ArrayList;
import java.util.Scanner;

/*
3
4 5
fgde
7 5
gndcafb
4 19
ekyv
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        int[] ks = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ks[i] = sc.nextInt();
            String tmp = sc.nextLine();
            tmp = sc.nextLine();
            arr.add(tmp);
        }
        for (int i = 0; i < n; i++) {
            String s =arr.get(i);
            int k = ks[i];
            char[] chs = s.toCharArray();
            char flag = 'a';
            char flag2 = 'a';
            char flag3 = 'z';

            for (int j = 0; j < s.length(); j++) {
                if(k<=0) break;
                if(s.charAt(j)-flag<=0) continue;
                else if(s.charAt(j)-flag<=k){
                    k = k-(s.charAt(j)-flag);
                    flag = s.charAt(j);
                }else if(s.charAt(j)-flag>k){
                    flag2 = s.charAt(j);
                    flag3 = (char)( s.charAt(j)-k);

                    k = 0;
                }
            }
            for (int j = 0; j < s.length(); j++) {
                if(chs[j]<=flag){
                    chs[j] = 'a';
                }else if(flag2!='a'&&chs[j]<=flag2 && chs[j]>flag3){
                    chs[j] = flag3;
                }

            }

            for (int j = 0; j < s.length(); j++) {
                System.out.print(chs[j]);
            }
            System.out.println();

        }

    }
}
