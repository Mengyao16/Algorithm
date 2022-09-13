package Algorithm.leetcode.lc0600;

import java.util.Arrays;

public class lc621 {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            arr[tasks[i]-'A']++;
        }
        Arrays.sort(arr);
        int ans = (arr[25]-1) * (n+1) +1;
        int i = 24;
        int count = 0;
        while(i>0&&arr[i]==arr[25]){
            count++;
            i--;

        }
        ans = ans + count;
        return Math.max(ans,tasks.length);

    }
}
