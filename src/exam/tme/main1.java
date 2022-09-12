package Algorithm.exam.tme;

public class main1 {
    public int minCut(String s){
        char[] a = s.toCharArray();
        int count = 0;
        for (char i:a
             ) {
            if(i=='i'){
                count++;
            }
        }
        return count-1;
    }
}
