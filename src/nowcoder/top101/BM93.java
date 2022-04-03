package Algorithm.nowcoder.top101;

public class BM93 {
    //最大容器问题，每次都移动边界值小的那一方
    public int maxArea(int[] height){
        int len = height.length;
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            maxArea = Math.max(maxArea,Math.min(height[right],height[left])*(right-left));
            if(height[right]>height[left]){
                left++;
            }else{
                right--;
            }


        }
        return maxArea;



    }
}
