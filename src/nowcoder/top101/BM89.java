package Algorithm.nowcoder.top101;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BM89 {

    //合并区间
    //先排序，那么可合并的子区间一定是连续的
    public int[][] merge(int[][] intervals){
        if(intervals.length==0) return new int[0][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> result = new ArrayList<>();
        int start = intervals[0][0],end  = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<=end&&intervals[i][1]>end){
                end = intervals[i][1];
            }else if(intervals[i][0]>end){
                result.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][2]);


    }
}
