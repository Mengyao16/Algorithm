package Algorithm.exam.zhaoshang;

import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int count = 0;
        int[] suma = new int[]{0,0,0};
        int[] sumb = new int[]{0,0,0};
        HashSet<Integer> aset = new HashSet<>();
        HashSet<Integer> bset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            //if(aset.contains(a[i])){
            //    continue;
            //}
            if(a[i]%4==0){
                suma[0]++;
            }else if(a[i]%4!=0&&a[i]%2==0){
                suma[1]++;
            }else{
                suma[2]++;
            }
            aset.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            //if(bset.contains(b[i])){
             //   continue;
            //}
            if(b[i]%4==0){
                sumb[0]++;
            }else if(b[i]%4!=0&&b[i]%2==0){
                sumb[1]++;
            }else{
                sumb[2]++;
            }
            bset.add(b[i]);
        }
        count = suma[0]*(sumb[1]+sumb[0]+sumb[2]) + suma[1] * (sumb[0]+sumb[1]) + suma[2]* sumb[0];

        System.out.println(count);
    }
}
