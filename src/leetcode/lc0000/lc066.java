package Algorithm.leetcode.lc0000;

public class lc066 {
    public int[] plusOne(int[] digits){
        int flag = 1;
        for (int i = digits.length-1; i >=0 ;i--) {
            int tmp = digits[i] + flag;
            digits[i] = tmp % 10;
            flag = tmp / 10;
            if(flag ==0){
                break;
            }
        }
        if(flag==0) return digits;
        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;



    }
}
