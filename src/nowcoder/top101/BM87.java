package Algorithm.nowcoder.top101;

public class BM87 {
    //合并两个有序的数组
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {3,5,6};
        merge(nums1,3,nums2,3);
    }

    //创建额外的数组空间用于存储
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int[] tmp = new int[m+n];
        int first = 0;
        int second = 0;

        while(first<m||second<n){
            if(first==m){
                tmp[first+second] = nums2[second++];
            }else if(second==n){
                tmp[first+second] = nums1[first++];
            }else if(nums1[first]<nums2[second]){
                tmp[first+second] = nums1[first++];
            }else {
                tmp[first+second] = nums2[second++];
            }
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = tmp[i];
        }
    }

    //如果从后向前存储，即由大至小存储，可以不使用额外空间
    public void merge2(int[] nums1,int m,int[] nums2,int n){

        while(m+n-1>=0){
            if(n==0){
                break;
            }else if(m==0){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }else if(nums1[m-1]<nums2[n-1]){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }else{
                nums1[m+n-1] = nums1[m-1];
                m--;
            }


        }

    }

    //更简单写法
    public void merge3(int[] nums1,int m,int[] nums2,int n){
        int last = m-- + n-- -1 ;
        while(n>=0){
            nums1[last--] = m>=0&&nums1[m]>nums2[n]?nums1[m--] :nums2[n--];
        }
    }

}
