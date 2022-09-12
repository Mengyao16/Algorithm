package Algorithm.exam.microsoft;

import java.util.Arrays;

public class solution1 {
    public static void main(String[] args) {
        int[] X =  {2,4,2,6,7,1};
        int[] Y = {0,3,2,4};
        int W = 2;
        int res = solution(X,Y,W);
        System.out.println(res);

    }
    public static int solution(int[] X, int[] Y, int W) {
        if(X.length==0){
            return 0;
        }
        Arrays.sort(X);
        int left = 0;
        int right = 0;
        int count=0;
        for (int i = 0; i < X.length; i++) {
            if(X[i]-X[left]<=W){
                right=i;
            }else{
                break;
            }
        }
        count++;



        while(right<X.length-1){
            left = right+1;
            for (int i = left; i < X.length; i++) {
                if(X[i]-X[left]<=W){
                    right=i;
                }else{
                    break;
                }
            }
            count++;


        }
        return count;

    }

}
