package Algorithm.exam.xiaomi;

import java.util.Scanner;

public class Main1 {
    static int ans  = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int x = sc.nextInt();
        String[] ss = s.substring(1,s.length()-1).split(",");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(ss[i]);
        }
        dfs(num,0,num.length-2,x-num[num.length-1]);
        dfs(num,1,num.length-1,x-num[0]);
        if(ans > num.length){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }



    }
    public static void dfs(int[] num,int start,int end,int x){
        if(x==0) {
            ans = Math.min(ans,num.length-(end-start+1));
            return ;
        }
        if(start>end){
            return ;
        }
        dfs(num,start+1,end,x-num[start]);
        dfs(num,start,end-1,x-num[end]);
    }
}
