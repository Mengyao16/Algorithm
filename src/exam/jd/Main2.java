package Algorithm.exam.jd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] a = s.toCharArray();
            int acnt=0,bcnt=0,ccnt=0;
            for (char color:a
                 ) {
                if(color=='A'){
                    acnt++;
                }else if(color=='B'){
                    bcnt++;
                }else if(color=='C'){
                    ccnt++;
                }
            }
            int[] count = new int[3] ;
            count[0] = acnt-n;
            count[1] = bcnt-n;
            count[2] = ccnt-n;

            if(acnt==n&&bcnt==n&&ccnt==n){
                System.out.println(0);
                continue;
            }
            ArrayList<Integer> aa = new ArrayList<>();
            int bb = 0;
            for (int j = 0; j < 3*n; j++) {
                if(a[j]=='A'){
                    if(acnt>n){
                        bb++;
                    }else{
                        if(bb>0){
                            aa.add(bb);
                        }
                        bb=0;
                    }
                }
                if(a[j]=='B'){
                    if(bcnt>n){
                        bb++;
                    }else{
                        if(bb>0){
                            aa.add(bb);
                        }
                        bb=0;
                    }
                }
                if(a[j]=='C'){
                    if(ccnt>n){
                        bb++;
                    }else{
                        if(bb>0){
                            aa.add(bb);
                        }
                        bb=0;
                    }
                }


            }
            if(bb>0){
                aa.add(bb);
            }
            System.out.println(2);


        }

    }
}
