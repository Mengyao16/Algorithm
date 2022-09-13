package Algorithm.leetcode.lc0000;

public class lc011 {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;
        int res = 0;
        while(left<right){
            int area = Math.min(height[right],height[left]) * (right - left);
            res = Math.max(area,res);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }

        }
        return res;
    }
}
