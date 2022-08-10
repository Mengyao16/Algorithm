package Algorithm.exam.wangyi;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }

        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*') {
                    count++;
                    label(map, i, j);
                }
            }
        }
        System.out.println(count);
    }

    public static void label(char[][] map, int i, int j) {
        int m = map.length - 1;
        int n = map[0].length - 1;
        if (map[i][j] == '*') {
            map[i][j] = 'v';
        } else {
            return;
        }

        if (j + 2 <= n) {
            label(map, i , j + 2);
        }
        if (j - 2 >= 0) {
            label(map, i , j - 2);
        }
        if (i - 2 >= 0 ) {
            label(map, i - 2, j);
        }
        if (i + 2 <=m  )
            label(map, i + 2, j );
    }
}

