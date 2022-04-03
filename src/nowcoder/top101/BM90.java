package Algorithm.nowcoder.top101;
import java.util.HashMap;
/*
还没写完
* */
public class BM90 {
    //最小覆盖子串
    HashMap<Character,Integer> ori = new HashMap<>();
    HashMap<Character,Integer> cnt = new HashMap<>();
    public String minWindow(String s ,String t){
        //滑动窗口，将包含t的全部字母的窗口称为可行窗口
        //滑动窗口有两个指针，一个用于延伸现有窗口的r指针，一个用于收缩窗口的l指针
        //在任意时刻，只有一个滑动窗口运动，另一个保持静止
        int tlen = s.length();
        for (int i = 0; i < tlen; i++) {
            char c = t.charAt(i);
            ori.put(c,ori.getOrDefault(c,0)+1);
        }
        int l=0,r=-1;
        int len = Integer.MAX_VALUE,ansL = -1,ansR = -1;
        int sLen = s.length();
        while(r<len){
            ++r;

        }
        return "a";



    }

}
