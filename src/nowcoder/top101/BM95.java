package Algorithm.nowcoder.top101;

import java.util.Arrays;

public class BM95 {
    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        System.out.println(candy(ratings));

    }
    //分糖果问题
    public  static int candy(int[] ratings){
        int len = ratings.length;
        int[] candys = new int[len];
        candys[0] = 1;
        for (int i = 1; i < len; i++) {
            candys[i] = ratings[i]>ratings[i-1]?candys[i-1]+1:1;
        }

        candys[len-1] = Math.max(1,candys[len-1]);
        for (int i = len-2; i >=0; i--) {
            if(ratings[i]>ratings[i+1]){
                candys[i] = Math.max(candys[i],candys[i+1]+1);
            }
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += candys[i];
        }

        return sum;


    }

    //还有一种常数空间方法
}
