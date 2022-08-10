package Algorithm.exam.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class main3 {
    public static ArrayList<Integer> lst = new ArrayList<>();
    public static int sum;
    private static boolean get = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bags = new int[N];
        for (int i = 0; i < N; i++) {
            bags[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            a = a + bags[i];
        }
        if(a%2!=0) {
            System.out.println(-1);
            return ;
        }
        sum = a/2;
        int avg= a/2;

        boolean[] used = new boolean[bags.length];
        dfs(bags,0,avg,used );
        if(!get){
            System.out.println(-1);
        }

    }
    public static void dfs(int[] arr,int cur,int s ,boolean[] used){
        if(s==0){
            get = true;
            System.out.println(sum/2);
            ArrayList<Integer> lst1 = new ArrayList<>();
            ArrayList<Integer> lst2 = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if(used[i]){
                    lst1.add(arr[i] );

                }else{
                    lst2.add(arr[i]);
                }
            }
            for (int i = 0; i < lst1.size(); i++) {
                System.out.println(lst1.get(i));
                if(i!=lst1.size()-1){
                    System.out.print(' ');
                }else{
                    System.out.println();
                }
            }
            for (int i = 0; i < lst2.size(); i++) {
                System.out.println(lst2.get(i));
                if(i!=lst1.size()-1){
                    System.out.print(' ');
                }
            }
            return ;
        }
        if(cur ==arr.length){
            return ;
        }
        used[cur] = true;
        dfs(arr,cur+1,s-arr[cur],used);
        used[cur] = false;


    }
}
