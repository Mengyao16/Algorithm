package Algorithm.nowcoder.top101;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class BM56 {
    //有重复数字的全排列
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        used = new boolean[num.length];
        backtrack(num,track);
        return  res;

    }
    public void backtrack(int[] nums,LinkedList<Integer> arr){
        if(track.size()==nums.length){
            res.add(new LinkedList(arr));
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i]){
                continue;
            }
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }

            track.add(nums[i]);
            used[i] = true;
            backtrack(nums,track);
            track.removeLast();
            used[i] = false;
        }
    }
}
