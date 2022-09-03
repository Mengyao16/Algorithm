package Algorithm.exam.jd;

import java.util.HashMap;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
            }else{
                map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
            }
        }
        int max1 = 0;
        int key1 = 0;
        int max2 = 0;
        int key2 = 0;
        for(int key : map1.keySet()){
            if(map1.get(key)>max1){
                max1 = map1.get(key);
                key1 = key;
            }
        }
        for(int key : map2.keySet()){
            if(map2.get(key)>max2){
                max2 = map2.get(key);
                key2 = key;
            }
        }
        if(key1!=key2){
            System.out.println(n-max1-max2);
        }else{
            map1.remove(key1);
            map2.remove(key2);
            int max3 = 0;
            int max4 = 0;
            for(int key : map1.keySet()){
                if(map1.get(key)>max3){
                    max3 = map1.get(key);

                }
            }
            for(int key : map2.keySet()){
                if(map2.get(key)>max4){
                    max4 = map2.get(key);

                }
            }
            System.out.println(Math.min(n-max1-max4,n-max2-max3));

        }

    }
}
