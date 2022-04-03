package Algorithm.nowcoder.top101;
import java.util.HashMap;
import java.util.HashSet;

public class BM92 {
    //最长无重复子数组
    public static void main(String[] args) {
        String a = "abba";
        System.out.println(lengthOfLongestSubstring(a));

    }
    public static int maxLength (int[] arr){
        int l = 0;
        int r = 0;
        int maxLength = 0;
        HashSet<Integer> map = new HashSet<>();
        while(r<arr.length){
            if(map.contains(arr[r])){
                map.remove(arr[l]);
                l++;

            }else{
                map.add(arr[r++]);
            }
            maxLength = Math.max(maxLength,r-l);
        }
        return maxLength;


    }
    //leetcode 3
    public static int lengthOfLongestSubstring(String s){
        if(s.length()<=1) return s.length();
        int maxLength = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int r=0,l=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r))+1);
                //最少必须从最左边开始
                //为什么要加这一步？
            }
            map.put(s.charAt(r),r);
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }
}
