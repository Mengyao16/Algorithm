package Algorithm.exam.microsoft;

public class main3 {
    public static void main(String[] args) {
        //int[] A = new int[]{1,2,4,3};
        //int[] B = new int[]{1,3,2,3};
        int[] A = new int[]{1,2};
        int[] B = new int[]{1,2};

        int res = solution(A,B);
        System.out.println(res);

    }
    public static int solution(int[] A, int[] B) {
        // write your code in Java 11 (Java SE 11)
        int[] tmp = new int[100000];
        for (int i = 0; i < A.length; i++) {
            if(A[i]>=B[i]) {
                tmp[A[i]-1] = 1;
            }else{
                tmp[B[i]-1] = 1;
            }
        }
        for (int i = 0; i < 100000; i++) {
            if(tmp[i]==0) return i+1;
        }
        return 100001;
    }

}
