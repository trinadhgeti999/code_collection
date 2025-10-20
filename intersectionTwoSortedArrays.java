package Practice;

import java.util.ArrayList;
import java.util.List;

public class intersectionTwoSortedArrays {
    public static List<Integer> intersection(int[] arr1,int[] arr2){
        List<Integer> list=new ArrayList<>();
        int visit[]=new int[arr2.length];
        //int temp[]=new int[arr1.length+arr2.length];

        outer:
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(visit[j]!=1){
                        list.add(arr1[i]);
                        visit[j]=1;
                        continue outer;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        int arr1[]={1,2,2,3,5,6,7,7};
        int arr2[]={2,3,5,5,6,7,9};

        List<Integer> resultArray=intersection(arr1,arr2);
        System.out.println(resultArray);
    }
}