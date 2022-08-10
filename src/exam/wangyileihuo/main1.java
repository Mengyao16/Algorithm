package Algorithm.exam.wangyileihuo;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] arr = new int[n][6][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                String str = sc.next();
                for (int k = 0; k < 6; k++) {
                    arr[i][j][k] = str.charAt(k) - '0';
                }
            }

        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(check(arr[i])){
                ans++;
            }

        }
        System.out.println(ans);

    }
    private static boolean check(int[][] matrix){
        for (int i = 0; i < 6; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 6; j++) {
                if(set.contains(matrix[i][j])){
                    return false;
                }else {
                    set.add(matrix[i][j]);
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 6; j++) {
                if(set.contains(matrix[j][i])){
                    return false;
                }else {
                    set.add(matrix[j][i]);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                HashSet<Integer> set = new HashSet<>();
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 3; l++) {

                        if(set.contains(matrix[i*2+k][j*3+l])){
                            return false;
                        }else{
                            set.add(matrix[i*2+k][j*3+l]);
                        }
                    }

                }

            }

        }




        return true;
    }
}
