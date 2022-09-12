package Algorithm.exam.wangyi;

import java.util.HashMap;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        HashMap<Long,Boolean>  map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                long chengji = (long) arr[i] *arr[j];
                boolean isok;
                if(map.containsKey(chengji)){
                    isok = map.get(chengji);
                }else{
                    isok = meet(chengji);
                }

                map.put(chengji ,isok);
                if(isok){
                    count++;

                }

            }

        }
        System.out.println(count);


    }
    private static boolean meet(long a ){
        int cnt = 1;
        for(int i=2;(long)i*i<=a;i++){
            if(a%i==0){
                long temp= 0;
                while(a%i==0){
                    a /= i;
                    temp++;
                }
                cnt *= (temp+1);
            }
            if(cnt>6){
                return false;
            }
        }
        if(a>1){
            cnt *=2;
        }
        return cnt ==6;
    }
}
