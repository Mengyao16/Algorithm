package Algorithm.exam;

/*
给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。

说明：

拆分时可以重复使用字典中的单词。
你可以假设字典中没有重复的单词。


示例 1：

输入: s = "applepenapple", wordDict = ["apple", "pen"]
输出: true
解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。你可以重复使用字典中的单词。

示例 2：

输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
输出: false

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        String s = "applepenapple";
        String[] workDict = new String[]{"apple","pen"};
        check(s,workDict);

    }
    private static boolean check(String s,String[] wordDict){
        int len = s.length();
        ArrayList<ArrayList<int[]>> interval = new ArrayList<>();

        for (int i = 0; i < wordDict.length; i++) {
            interval.add(compare(s,wordDict[i]));
        }
        int size = 0;

        for (int i = 0; i < interval.size(); i++) {
            size = size + interval.get(i).size();
        }
        int[][] arr = new int[size][2];
        int k = 0;
        for (int i = 0; i < interval.size(); i++) {
            for (int j = 0; j < interval.get(i).size(); j++) {
                arr[k] = interval.get(i).get(j);
                k++;
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        if(arr[0][0]!=0){
            return false;
        }
        if(arr[arr.length-1][1]!=arr.length){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

            }
        }
        return false;



    }

    private static ArrayList<int[]> compare(String s, String word){
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i <= s.length()-word.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {
                if(s.charAt(i+j)!=word.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(new int[]{i,i+word.length()});
            }
        }
        return res;
    }

}
