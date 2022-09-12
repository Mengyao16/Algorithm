package Algorithm.leetcode;

import java.util.LinkedList;

public class lc084 {
    //柱状图中的最大矩形
    //思路：单调栈
    public int largestRectangleArea(int[] heights) {
        LinkedList<Integer> stack = new LinkedList<>();
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if(stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            if(heights[i]>=heights[stack.peek()]){
                stack.push(i);
                continue;
            }
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                res = Math.max(res,(i-stack.peek())*heights[stack.peek()]);
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            res = Math.max(res,(heights.length-stack.peek())*heights[stack.pop()]);
        }
        return res;


    }
}
