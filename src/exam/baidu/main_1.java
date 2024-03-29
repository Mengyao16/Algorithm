package Algorithm.exam.baidu;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] v = new int[N];
        int[] w = new int[N];
        for(int i=0;i<N;i++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int[] dp = new int[W+1];
        for(int i=0;i<N;i++){
            for(int j = W;j>=v[i];j--){
                if(v[i]<=j){
                    dp[j] = Math.max(dp[j],dp[j-v[i]]+w[i]);
                }
                if(2*v[i]<=j){
                    dp[j] = Math.max(dp[j],dp[j-2*v[i]]+2*w[i]);
                }
            }
        }
        System.out.println(dp[W]);
    }

}