package Algorithm.nowcoder.top101;


public class BM66 {

    //最长公共子数组
    public int findLength(int[] nums1,int[] nums2){
        if(nums1.length==0||nums2.length==0) return 0;
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m+1][n+1];
        int ans = 0;
        for (int i = 1; i <=m; i++) {
            for(int j=1;j<=n;j++){
                dp[i][j] = nums1[i-1]==nums2[j-1]?dp[i-1][j-1]+1:0;
                ans = Math.max(ans,dp[i][j]);
            }

        }
        return ans;
    }
    public String LCS (String str1,String str2){
        int maxLength = 0;
        int maxIndex = 0;
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <=m; i++) {
            char a = str1.charAt(i-1);
            for (int j = 1; j <=n; j++){
                char b = str2.charAt(j-1);
                if(a==b){
                    dp[i][j] = dp[i-1][j-1] +1;
                    if(dp[i][j]>maxLength){
                        maxLength = dp[i][j];
                        maxIndex = i;
                    }
                }
                else{
                    dp[i][j] = 0;
                }
            }

        }
        return str1.substring(maxIndex-maxLength,maxIndex);
    }


}
