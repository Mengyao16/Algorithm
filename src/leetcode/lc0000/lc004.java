package Algorithm.leetcode.lc0000;

public class lc004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int l1 = 0;
        int l2 = 0;
        int last = 0,cur = 0;
        int medium = (len1+len2)/2 +1;
        for(int i = 0;i<medium;i++){
            last = cur;
            if(l1==len1){
                cur = nums2[l2++];
            }else if(l2==len2){
                cur = nums1[l1++];
            }else if(nums1[l1]>nums2[l2]){
                cur = nums2[l2++];
            }else{
                cur = nums1[l1++];
            }

        }
        return (len1+len2)%2==0?(double)(last+cur)/2:cur;

    }
}
