package Algorithm.leetcode.CodingInterviews;

public class ci05 {
    //替换空格
    //输入s = "We are happy."
    //输出"We%20are%20happy."
    public String replaceSpace(String s){

        return s.replace(" ","%20");
        /*
        * s.replace(" ","%20");
        * return s;
        * 这样写是错的
        * */
    }
    public String replaceSpace2(String s){
        StringBuilder res = new StringBuilder();
        for (char c:
             s.toCharArray()) {
            if(c==' '){
                res.append("%20");
            }else res.append(c);
        }
        return res.toString();
    }
}
