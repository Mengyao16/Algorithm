package Algorithm.exam.jd;
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            ArrayList<Integer> lst = new ArrayList(Arrays.asList(a));
            int cur =1;
            ListIterator<Integer> iterator = lst.listIterator();
            while(iterator.hasNext()){
                int j = iterator.next();
                if(j==cur+1){
                    cur = cur+1;
                }else if(j>cur+1){
                    iterator.remove();
                }
            }
            cur = k;
            while(iterator.hasPrevious()){
                int j = iterator.previous();
                if(j==cur-1){
                    cur = cur -1;
                }
                else if(j<cur-1){
                    iterator.remove();
                }
            }
            int[] cnt = new int[k];
            for(Integer integer:lst){
                cnt[integer-1]+=1;
            }
            System.out.println(Arrays.stream(cnt).min().getAsInt());

        }
    }
    
}
