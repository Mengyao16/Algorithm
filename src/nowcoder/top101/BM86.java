package Algorithm.nowcoder.top101;

public class BM86 {
    //大数加法
    //leetcode415
    public String addStrings(String num1,String num2){
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuffer ans = new StringBuffer();
        int flag = 0;
        while(Math.max(len1,len2)>0||flag!=0){
            int first = len1>0 ?num1.charAt(len1-1)-'0':0;
            int second = len2>0 ?num2.charAt(len2-1)-'0':0;
            int sum = first+second+flag;
            flag = sum>=10?1:0 ;
            ans.append(sum%10);
            len1--;
            len2--;


        }
        ans.reverse();
        return ans.toString();
    }

}
