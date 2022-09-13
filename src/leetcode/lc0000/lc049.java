package Algorithm.leetcode.lc0000;

import java.util.*;

public class lc049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String s :strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            //不能用tostring

            String str = new String(ch);
            ArrayList<String> arr = map.getOrDefault(str,new ArrayList<>());
            arr.add(s);
            map.put(str,arr);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
