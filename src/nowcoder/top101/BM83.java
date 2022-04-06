package Algorithm.nowcoder.top101;

public class BM83 {
    //字符串变形
    public String trans(String s,int n){
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(c[i]<='Z'&&c[i]>='A'){
                c[i] +=32;
            }else if(c[i]<='z'&&c[i]>='a'){
                c[i] -=32;
            }
        }
        int index = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]==' '){
                reverse(c,index,i-1);
                index = i+1;
            }
        }
        reverse(c,index,n-1);
        reverse(c,0,c.length-1);
        return new String(c);
    }
    void reverse (char[] c,int start,int end){
        while(start<end){
            char tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
        }
    }
}
