package Algorithm.exam.baidu;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int ans = 0;
        int pa = 0;
        int pb = 0;
        int time = 0;
        for (int i = 0; i < m+n; i++) {
            if(pa>=m){
                if(time+b[pb]<=t){
                    pb++;
                    time = time + b[pb];
                    ans++;
                }else{
                    break;
                }
            }else if(pb>=n){
                if(time+a[pa]<=t){
                    pa++;
                    time = time + a[pa];
                    ans++;
                }else{
                    break;
                }
            }else{
                if(a[pa]>=b[pb]){
                    if(time+b[pb]<=t){
                        pb++;
                        time = time + b[pb];
                        ans++;
                    }else{
                        break;
                    }
                }else{
                    if(time+a[pa]<=t){
                        pa++;
                        time = time + a[pa];
                        ans++;
                    }else{
                        break;
                    }
                }
            }


        }

        System.out.println(ans);

    }
}
