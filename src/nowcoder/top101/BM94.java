package Algorithm.nowcoder.top101;

public class BM94 {
    //接雨水问题
    //leetcode 42
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap3(arr));
    }


    //对于下标i，下雨后能到达的最大高度等于下标i两边的最大高度的最小值
    //下标i处能接的雨水量等于最大高度减去height[i]
    //暴力解法
    public static int trap(int[] height){
        int len = height.length;
        int sum = 0;
        for (int i = 1; i < len-1; i++) {
            int left = i-1;
            int right = i+1;
            int leftMax = height[i];
            int rightMax = height[i];
            while(left>=0){
                leftMax = Math.max(height[left],leftMax );
                left--;
            }
            while(right <= len-1){
                rightMax = Math.max(height[right],rightMax );
                right++;
            }
            if(Math.min(rightMax,leftMax)-height[i]>0){
                sum += (Math.min(rightMax,leftMax)-height[i]);
            }
        }
        return sum;
    }

    //动态规划
    //从左向右遍历，再从右向左遍历，保存下来需要的数组
    //dp[i][0] = max(height[0-i])
    //dp[i][0] = max(height[len-1-i])
    public static int trap2(int[] height){
        int[][] dp = new int[height.length][2];
        dp[0][0] = height[0];
        for (int i = 1; i < height.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],height[i]);
        }
        dp[height.length-1][1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            dp[i][1] = Math.max(dp[i+1][1],height[i]);
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(dp[i][0],dp[i][1])-height[i];
        }
        return sum;
    }

    //双指针的方法
    //动态规划方法中空间复杂度为o(n),使用双指针可以将空间复杂度降为o(1)
    /*对于位置left而言，它左边最大值一定是left_max，右边最大值“大于等于”right_max，这时候，如
    果left_max<right_max成立，那么它就知道自己能存多少水了。无论右边将来会不会出现更大的right_max，
    都不影响这个结果。 所以当left_max<right_max时，我们就希望去处理left下标，
    反之，我们希望去处理right下标。*/
    public static int trap3(int[] height){
        //创建了两个指针
        int left = 0,right = height.length-1;
        int leftMax = 0,rightMax = 0;
        int sum = 0;
        while(left<=right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(leftMax<rightMax){
                sum += leftMax-height[left];
                ++left;
            }else {
                sum += rightMax-height[right];
                right--;
            }
        }
        return sum;


    }

}
