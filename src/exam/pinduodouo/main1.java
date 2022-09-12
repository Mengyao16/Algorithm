package Algorithm.exam.pinduodouo;

import java.util.HashMap;
import java.util.Scanner;

public  class main1 {
    public static  class location{
        int inteval = 0;
        int last = 0;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = sc.nextInt();
        }



        HashMap<Integer,location> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(color[i])){
                if(map.get(color[i]).inteval!=-1){
                    if(map.get(color[i]).inteval!=0){
                        if((i-map.get(color[i]).last)!=map.get(color[i]).inteval){
                            map.get(color[i]).inteval = -1;
                        }else{
                            map.get(color[i]).last = i;
                            //map.get(color[i]).inteval = i-map.get(color[i]).last;
                        }
                    }else{
                        map.get(color[i]).inteval = i-map.get(color[i]).last;
                        map.get(color[i]).last = i;
                    }

                }

            }else{
                location local = new location();
                local.inteval = 0;
                local.last = i;
                map.put(color[i],local );
            }

        }
        int count =0;
        for(int key:map.keySet()){
            if(map.get(key).inteval!=-1){
                count++;
            }
        }
        System.out.println(count);
        for(int key:map.keySet()){
            if(map.get(key).inteval!=-1){
                System.out.print(key);
                System.out.print(" ");
                System.out.print(map.get(key).inteval);
                System.out.println();
            }
        }
        return ;

    }
}
