package Algorithm.nowcoder.top101;
import java.util.ArrayList;
import java.util.List;

public class BM74 {
    //数字字符串转化为ip地址
    public List<String> restoreIpAddress(String s){
        int len = s.length();
        List<String> ans = new ArrayList<>();
        if(len<4||len>12) return ans;

        for (int i = 0; i < 3; i++) {
            if(len-1-i<3&&len-1-i>9) continue;
            int first = Integer.parseInt(s.substring(0,i+1));
            if(first>255) continue;
            for (int j = i+1; j <i+4 ; j++) {
                if(len-1-j<2&&len-1-j>6) continue;
                for (int k = j+1; k < j+4; k++) {
                    if(len-1-k<2&&len-1-k>3) continue;

                }

            }

        }
        return ans;
    }

}
