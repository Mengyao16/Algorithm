package Algorithm.exam.tme;

public class main3 {
    public int numsofString(int n,int k){
        int mod = 1000000;
        int res = 1;
        if(n<2*k) return 0;

        if(n>=2*k){
            int left = n-2*k;
            res = res * 26;
            for (int i = 1; i < k; i++) {
                res = res*25%mod;
            }
            for (int i = 0; i < left; i++) {
                res = res*k%mod;
            }
        }
        return res;


    }
}
