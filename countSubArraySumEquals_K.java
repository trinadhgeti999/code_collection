package Practice;

import java.util.Map;
import java.util.HashMap;

public class countSubArraySumEquals_K {
    public static int findcount(int[] arr,int k){
       Map<Integer,Integer> map=new HashMap<>();

       int sum=0;
       int count=0;
       map.put(0, 1);//instead we can use if condition below

       for(int i=0;i<arr.length;i++){
        sum+=arr[i];

        // if(sum==k){//
        //     count++;
        // }

        if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
        }

        map.put(sum,map.getOrDefault(sum,0)+1);

       }
       return count;
    }

    
    public static void main(String[] args) {
        int arr[]={1,-1,0};
        int k=0;
        int countSubArraySums=findcount(arr,k);
        System.out.println(countSubArraySums);
    }
}




/*
//brute
public class countSubArraySumEquals_K {
    public static int findcount(int[] arr,int k){

        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){ 
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
            sum=0;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        int countSubArraySums=findcount(arr,k);
        System.out.println(length);
    }
}
     */
