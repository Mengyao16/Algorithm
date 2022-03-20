package Algorithm.nowcoder.top101;

public class BM47_Topk {

    public static int findKth(int[] a, int n, int K) {
        return quickSort(a, 0, n - 1, n-K);

    }


    public static int quickSort(int[] a, int low, int high, int K) {
        int mid = getSplitIndex(a, low, high);
        if (mid == K ) return a[mid];
        else if (mid < K ) {
            return quickSort(a, mid + 1, high, K);
        } else return quickSort(a, low, mid - 1, K);
    }

    private static int getSplitIndex(int[] array, int low, int high) {
        int pivot = array[low];
        while (low < high) {
            //从右向左找第一个小于pivot的数
            while (low < high && array[high] >= pivot) {
                high--;
            }
            if (low < high) {
                array[low++] = array[high];
            }
            while (low < high && array[low] < pivot) {
                low++;
            }
            if (low < high) {
                array[high--] = array[low];
            }
        }
        array[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] a = {10,10,9,9,8,7,5,6,4,3,4,2};
        int result =  findKth(a, 12,  3);
        System.out.println(result);
    }
}

