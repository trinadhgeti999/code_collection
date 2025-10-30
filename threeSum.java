package Practice;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.


//brute
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {

    public static List<List<Integer>> tripletsArray(int[] arr){
        Set<List<Integer>> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> list=Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> triplets=tripletsArray(arr);
        System.out.println(triplets);
    }
}
