package Algorithm.exam.microsoft;

import java.util.HashMap;

public class main2 {
    public static void main(String[] args) {
        int[] A = new int[]{};
        int M = 8;
        int res = solution(A,M);
        System.out.println(res);

    }

    public static int solution(int[] A, int M) {
        // write your code in Java 11 (Java SE 11)
        HashMap<Integer,Integer> map  = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if(A[i]>=0){
                map.put(A[i]%M,map.getOrDefault(A[i]%M,0)+1);
            }else{
                int tmp = A[i]/M;
                tmp = (tmp+1) * M + A[i];
                map.put(tmp%M,map.getOrDefault(tmp%M,0)+1);
            }

        }
        int res = 0;

        for(int key : map.keySet()){
            res  = Math.max(res,map.get(key));
        }
        return res;
    }

}
