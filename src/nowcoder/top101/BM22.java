package Algorithm.nowcoder.top101;

public class BM22 {
    public int compareVersion(String version1,String version2){
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length;
        int len2 = v2.length;
        for (int i = 0; i < len1||i<len2; i++) {
            int x = 0;
            int y = 0;
            if(i<len1){
                x = Integer.parseInt(v1[i]);
            }
            if(i<len2){
                y = Integer.parseInt(v2[i]);
            }
            if(x>y) return 1;
            if(x<y) return -1;
        }
        return 0;

    }


}
