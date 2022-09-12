package Algorithm.exam.microsoft;

import java.util.HashMap;


public class solution2 {
    public static void main(String[] args) {
        String s = "39878";
        String a = solution(s);
        System.out.println(a);
    }
    public static String solution(String S){
        StringBuffer sb = new StringBuffer();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put((char) ('0'+i),0);
        }
        for(Character c:S.toCharArray()){
            map.put(c,map.get(c)+1);
        }
        for (int i = 9; i > 0; i--) {
            Character c = (char) ('0'+i);
            int num = map.get(c);
            while(num>1){
                sb.append(c);
                num = num-2;
            }
        }
        if(sb.length()>=1){
            for (int i = 0; i < map.get('0')/2; i++) {
                sb.append('0');
            }
        }
        StringBuffer res = new StringBuffer();
        res.append(sb.toString());

        for (int i = 9; i >= 0; i--) {
            Character c = (char) ('0'+i);
            int num = map.get(c);
            if(num%2==1){
                res.append(c);
                break;
            }
        }
        res.append(sb.reverse());
        if(res.length()==0){
            return "0";
        }



        return res.toString();

    }

}
