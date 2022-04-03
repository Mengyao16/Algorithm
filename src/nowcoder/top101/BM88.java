package Algorithm.nowcoder.top101;

public class BM88 {
    //判断是否为回文字符串
    public boolean judge(String str){
        int len = str.length();
        for(int i=0,j= len-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    /*leetcode125验证回文字符串
    输入: "A man, a plan, a canal: Panama"
    输出: true
    解释："amanaplanacanalpanama" 是回文串
    忽略字母大小写，只考虑数字和字符串
     */

    //在字符串上直接判断
    public boolean isPalindrome(String s){
        int len = s.length();
        int l = 0,r = len-1;
        while(l<r){
            while(!Character.isLetterOrDigit(s.charAt(l))&&l<r){
                ++l;
            }
            while(!Character.isLetterOrDigit(s.charAt(l))&&l<r){
                --r;
            }
            if(l<r){
                if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                    return false;
                }
                ++l;
                --r;
            }
        }
        return false;
    }
    //用StringBuffer保存下来，再用双指针
    public boolean isPalindrome2(String s){
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int n = sgood.length();
        int left = 0,right = n-1;
        while(left<right){
            if(Character.toLowerCase(sgood.charAt(left))!=Character.toLowerCase(sgood.charAt(right))){
                return false;
            }
            ++left;
            --right;
        }
        return true;

    }

}
