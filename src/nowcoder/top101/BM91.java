package Algorithm.nowcoder.top101;

public class BM91 {
    //反转字符串

    //注意返回值要重新构成new String

    public static String solve(String str){

        char[] strToChar = str.toCharArray();
        int l = 0;
        int r = strToChar.length-1;
        while(l<r){
            char tmp = strToChar[r];
            strToChar[r] = strToChar[l];
            strToChar[l] = tmp;
            l++;
            r--;

        }

        return new String(strToChar);

    }
}
