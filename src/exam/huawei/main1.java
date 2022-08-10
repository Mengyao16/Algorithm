package Algorithm.exam.huawei;


import java.util.*;

/*

2
0,2,200,1,0
1,3,400,2,1
2 2 3 300 3 2
 */
/*

4
0,2,200,0,1
1,3,400,0,1
2,3,400,1,0
3,3,300,0,1
3 1 3 200 0 1
 */
/*
6
0,2,200,0,1
1,4,330,2,1
2,3,400,3,1
3,3,310,1,1
4,3,320,8,1
5,3,330,0,1
3 2 3 300 9 2
 */
public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[][] attribute  = new int[M][5];
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            String[] ss = s.split(",");
            for (int j = 0; j < ss.length; j++) {
                attribute[i][j] = Integer.parseInt(ss[j]);
            }
        }

        int N = sc.nextInt();
        int strategy = sc.nextInt();
        int cpuCount = sc.nextInt();
        int memSize = sc.nextInt();
        int cpuArch = sc.nextInt();
        int supportNP = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();



        if(strategy==1){

            Arrays.sort(attribute, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if(o1[1]-o2[1]!=0){
                            return o1[1]-o2[1];
                        }else if(o1[2]-o2[2]!=0){
                            return o1[2]-o2[2];

                        }else {
                            return o1[0]-o2[0];
                        }
                    }
                });

            for (int i = 0; i < M; i++) {
                if(attribute[i][1]>=cpuCount){
                    if(attribute[i][2]>=memSize){
                        if(attribute[i][3]==cpuArch||cpuArch==9){
                            if(attribute[i][4]==supportNP||supportNP==2){
                                res.add(attribute[i][0]);
                            }
                        }
                    }
                }
                if(res.size()==N){
                    break;
                }
            }
        }else{
            Arrays.sort(attribute, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[2]-o2[2]!=0){
                        return o1[2]-o2[2];
                    }else if(o1[1]-o2[1]!=0){
                        return o1[1]-o2[1];

                    }else {
                        return o1[0]-o2[0];
                    }
                }
            });

            for (int i = 0; i < M; i++) {
                if (attribute[i][2] >= memSize) {
                    if (attribute[i][1] >= cpuCount) {
                        if (attribute[i][3] == cpuArch || cpuArch == 9) {
                            if (attribute[i][4] == supportNP || supportNP == 2) {
                                res.add(attribute[i][0]);
                            }
                        }
                    }
                }
                if (res.size() == N) {
                    break;
                }
            }

        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        Arrays.sort(ans);
        System.out.print(res.size());
        System.out.print(' ');
        for (int i = 0; i < res.size(); i++) {
            System.out.print(ans[i]);
            if(i==res.size()-1){
                continue;
            }
            System.out.print(' ');
        }

    }
}
