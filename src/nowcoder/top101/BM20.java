package Algorithm.nowcoder.top101;

public class BM20 {
    //数组中的逆序对
    int[] nums ,tmp;
    public int InversePair(int [] array){
        this.nums = array;
        tmp = new int[array.length];
        return mergeSort(0,array.length-1);


    }
    public int mergeSort(int r,int l){
        //终止条件
        if(l>=r) return 0;

        //递归阶段
        int mid = (l+r)/2;
        int res = mergeSort(r,mid)+mergeSort(mid+1,l);

        //合并阶段
        int i=r,j = mid+1;
        for (int k = l; k <= r; k++) {
            tmp[k] = nums[k];
        }
        for (int k = l; k <= r; k++) {
            if(i==mid+1) nums[k] = tmp[j++];
            else if(j==r+1||tmp[i]<=tmp[j]){
                nums[k] = tmp[j++];
            }
            else{
                nums[k] = tmp[j++];
                res += mid -i+1;
            }
        }
        return res;



    }
}
