package Algorithm.exam.tme;

import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

    }
    public int minOperations (String str) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int ans = 0;
        if(map.size()==26){
            for(char key:map.keySet()){
                ans += map.get(key)-1;
            }
        }else{
            int tmp = 26- map.size();
            for(char key:map.keySet()){
                if(map.get(key)>2 && tmp>0){
                    if(map.get(key)/2>tmp){
                        ans = ans + tmp + map.get(key) - tmp*2 -1;

                    }else{
                        ans = ans + map.get(key)/2;
                        tmp = tmp - map.get(key)/2;
                    }

                }else{
                    ans += map.get(key)-1;
                }

            }
        }
        return ans;
        // write code here
    }
}
