package Algorithm.exam.lenovo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        char[][] alice = new char[n][3];
        char[][] bob = new char[n][3];
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            alice[i][0] = tmp.toCharArray()[0];
            alice[i][1] = tmp.toCharArray()[2];
            alice[i][2] = tmp.toCharArray()[4];
            bob[i][0] = tmp.toCharArray()[6];
            bob[i][1] = tmp.toCharArray()[8];
            bob[i][2] = tmp.toCharArray()[10];
        }
        Integer[][] chars = new Integer[6][6];

        for (int i = 0; i < n; i++) {
            Arrays.sort(chars[i],new Comparator<Integer>(){
                public int compare(Integer o1, Integer o2) {
                    if(o1==o2) return 0;
                    if(o1=='A') return 1;
                    if(o2=='A') return -1;
                    return o1-o2;
                }

            });

        }

    }
}
