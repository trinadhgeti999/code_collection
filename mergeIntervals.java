package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {

    public static List<List<Integer>> merge(int[][] intervals){
        List<List<Integer>> list=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;

        int i=0;

        while (i<n) {
            int start=intervals[i][0];
            int end=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end=Math.max(end,intervals[j][1]);
                j++;
            }

            list.add(Arrays.asList(start,end));
            i=j;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,5},{1,5}};

        List<List<Integer>> result=merge(intervals);
        System.out.println(result);
    }
}
