package Algorithm.nowcoder.top101;

import java.util.List;
import java.util.LinkedList;

public class BM55 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permute(int[] num){


        int[] visited = new int[num.length];
        traceback(visited,new LinkedList<Integer>());

        return res;
    }
    public void traceback(int[] visited,LinkedList<Integer> arr){
        if(arr.size()==visited.length){
            res.add(new LinkedList(arr));
            return ;
        }
        for (int i = 0; i < visited.length; i++) {
            if(visited[i] == 1){
                continue;
            }
            visited[i] = 1;
            arr.add(i+1);
            traceback(visited,arr);
            visited[i] = 0;
            arr.removeLast();

        }
    }

}
