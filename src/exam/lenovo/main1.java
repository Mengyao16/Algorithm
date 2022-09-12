package Algorithm.exam.lenovo;

import java.util.ArrayList;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            arr.add(tmp);
        }
        for(String s :arr){
            if(s.length()<6){
                System.out.println("NO");
                continue;
            }
            if(!numAndCharacter(s)){
                System.out.println("NO");
                continue;
            }
            if(!isFiveLetter(s)){
                System.out.println("NO");
                continue;
            }
            if(!isSame(s)){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");



        }
    }
    public static boolean numAndCharacter(String s){
        int numcount = 0;
        int numchar = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                numcount++;
            }else{
                numchar++;
            }

        }
        return numchar>numcount;

    }
    public static boolean isFiveLetter(String s){
        int countletter = 0;
        for (int i = 0; i < 5; i++) {
            if(Character.isLetter(s.charAt(i))){
                countletter++;
            }
        }
        if(countletter>=5) return false;
        int left = 0;
        int right = 4;
        while((right+1)<s.length()){
            if(Character.isLetter(s.charAt(left))){
                countletter--;
            }
            if(Character.isLetter(s.charAt(right+1))){
                countletter++;
            }
            if(countletter==5){
                return false;
            }
            left++;
            right++;

        }


        return true;
    }
    public static boolean isSame(String s){
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }

        }
        return true;
    }

}
