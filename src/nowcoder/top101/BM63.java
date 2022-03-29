package Algorithm.nowcoder.top101;

public class BM63 {
    public int numWay(int n){
        int a = 1;
        int b = 1;
        int sum ;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a % 1000000007;

    }
}
