package Algorithm.exam.wangyileihuo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int HP  = sc.nextInt();

            int LH = sc.nextInt();

            int HH = sc.nextInt();
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            //int[] arr = new int[]{12,16,18};
            HashSet<Integer> visited = new HashSet<>();
            LinkedList<Integer> queue = new LinkedList<>();
            queue.offer(HP);
            int cnt = 0;
            boolean get = false;
            while(!queue.isEmpty()&& !get){
                cnt++;
                for (int j = queue.size(); j >0 ; j--) {
                    Integer poll  = queue.poll();
                    for (int a: arr) {
                        int sub = poll -a;
                        if(sub>=LH&& !visited.contains(sub)){
                            visited.add(sub);
                            if(sub<=HH){
                                get = true;
                                break;
                            }else{
                                queue.offer(sub);
                            }
                        }

                    }

                }
            }

            System.out.println(get?cnt:0);


        }

    }
}
/*
2
100 15 20 3
12 16 18
100 15 20 3
12 16 18
 */