package Algorithm.nowcoder.top101;

public class BM21 {
    public static void main(String[] args) {
        int[] numbers = {1,3,5};
        int result = minArray (numbers);
    }

    /*
    * 必须跟right比，不能跟left比
    * */
    public static int minArray(int[] numbers){
        int left = 0;
        int right = numbers.length - 1 ;
        while(left<right) {
            int mid = (left + right) / 2;
            if (numbers[right] < numbers[mid]) {
                left = mid + 1;
            } else if (numbers[right] > numbers[mid]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
