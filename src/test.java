package Algorithm;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[] a = {1,4,15,8,5};
        String color = "BRRBB";
        int[][] quyu = new int[2][n];
        for (int i = 0; i < n; i++) {
            quyu[0][i] = 0;
            int temp = a[i];
            while(temp%2==0) {
                temp = temp/2;
                quyu[0][i]++;
            }
            quyu[1][i] = 0;
            temp = a[i];
            while(temp%5==0) {
                temp = temp/5;
                quyu[1][i]++;
            }

        }



    }
}
