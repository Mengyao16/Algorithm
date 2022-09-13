package Algorithm.leetcode.lc0700;

import java.util.LinkedList;

public class lc739 {
    /*
     每日温度
     给定一个整数数组temperatures，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     输入: temperatures = [73,74,75,71,69,72,76,73]
     输出: [1,1,4,2,1,1,0,0]

     */
    /*
    思路：单调栈
    1、入栈
    2、如果栈顶温度小于当前温度，出栈，否则，继续入栈

     */
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<int[]> stack = new LinkedList<>();
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            while(!stack.isEmpty() && stack.peek()[1]<temperatures[i]){


                int[] tmp = stack.pop();
                res[tmp[0]]  = i-tmp[0];

            }
            stack.push(new int[]{i,temperatures[i]});

        }
        return res;





    }
}
