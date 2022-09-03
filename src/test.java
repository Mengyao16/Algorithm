package Algorithm;

import java.util.PriorityQueue;

public class test {

    public int solution(int[] A,int N){
        PriorityQueue<Double> pq = new PriorityQueue<>();
        int sum = 0;
        for(int a:A){
            sum = sum + a;
            pq.offer((double)a);
        }
        int res = 0;
        return res;

    }
    private int res = 0;
    public int solution2(int[] X ,int[] Y , int N){
        int res = 0;
        dfs(X,Y,0,0);
        return res;
    }
    public void dfs(int[] X,int[] Y,int level,double sum){
        if(level==X.length){
            return ;
        }
        if(sum==1){
            res++;
        }else if(sum>1){
            return ;
        }
        for (int i = level; i < X.length; i++) {
            dfs(X,Y,i+1,sum+X[i]/Y[i]);
        }



    }

    public static void main(String[] args) {
        int[] A = new int[]{4,2,5,4,3,5,1,4,2,7,1};
        int X  = 3;
        int Y = 2;
        int ans = solution3(A,X,Y);
        System.out.println(ans);

    }
    public static int solution3(int[] A ,int X,int Y){
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < Y; i++) {
            int sum = 0;
            int left = i;
            int right = i+(X-1)*Y;
            for (int j = 0; j < X && right<A.length; j++) {
                sum = sum + A[i+j*Y];
            }
            if(right<A.length){
                res = Math.min(res,sum);
            }
            while(right+Y<=A.length-1){
                res = Math.min(res,res-A[left]+A[right+Y]);
                left = left +Y;
                right = right +Y;
            }


        }
        return res;
    }


}
