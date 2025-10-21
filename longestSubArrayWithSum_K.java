package Practice;

import java.util.Map;
import java.util.HashMap;

public class longestSubArrayWithSum_K {
    public static int findLongestSubArrayLength(int[] arr,int k){
        Map<Integer,Integer> map=new HashMap<>();

        int max_length=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(sum==k){
                max_length=i+1;
            }

            if(map.containsKey(sum-k)){
                int length=i-map.get(sum-k);
                if(length>max_length){
                    max_length=length;
                }
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,0,4,2,3};
        int k=0;
        int length=findLongestSubArrayLength(arr,k);
        System.out.println(length);
    }
}

//brute
/*
public class longestSubArrayWithSum_K {
    public static int findLongestSubArrayLength(int[] arr,int k){
        int longest_length=0;
        int current_length=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            inner:
            for(int j=i;j<arr.length;j++){
                //if(sum<k){//->for only positive numbers
                    sum+=arr[j];
                    if(sum==k){
                        current_length=j-i+1;
                        longest_length=Math.max(current_length, longest_length);
                    }
                // //}else{
                //     sum=0;
                //     break inner;
                // }
            }
        }
        return longest_length;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,1,1,4,2,3};
        int k=6;
        int length=findLongestSubArrayLength(arr,k);
        System.out.println(length);
    }
}

*/