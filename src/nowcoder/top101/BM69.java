package Algorithm.nowcoder.top101;

public class BM69 {
    //把数字翻译成字符串
    //leetcode 剑指offer 46，略有不同
    public int translateNum(int num){
        String str = num +"";
        int len = str.length();
        int p = 0,q = 1,r = 1;
        for (int i = 1; i <len; i++) {
            p=q;
            q = r;

            r = q;

            String pre = str.substring(i-1,i+1);
            if(Integer.parseInt(pre)>=10&&Integer.parseInt(pre)<=25){
                r = r+p;
            }
        }
        return r;

    }
}
