package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//brute-linear search
//and

//hashset-optimized
public class longestConsecutiveSequence {
    public static int findConsecutiveSequence(int[] arr){
         Set<Integer> set=new HashSet<>();

         if(arr.length==0) return 0;

         for(int it:arr){
            set.add(it);
         }

         int maxCount=0;
         for(int it:set){
            if(!set.contains(it-1)){
                int currentCount=1;
                int current=it;
                while(set.contains(current+1)){
                    currentCount++;
                    current++;
                }
                if(maxCount<currentCount){
                maxCount=currentCount;
                }
            }
         }
         return maxCount;
    }

    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,10,3,2,1,105,103,104};

        int length=findConsecutiveSequence(arr);
        System.out.println(length);
    }
}

/*
//sort-better solution
public class longestConsecutiveSequence {
    public static int findConsecutiveSequence(int[] arr){

        Arrays.sort(arr);

        if(arr.length==0) return 0;

        int maxCount=1;
        int currentCount=1;
        for(int i=1;i<arr.length;i++){

            if(arr[i]==arr[i-1]){
                continue;
            }else if(arr[i]==arr[i-1]+1){
                currentCount++;
                if(currentCount>maxCount){
                    maxCount=currentCount;
                }
            }else{
                currentCount=1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,10,3,2,1,105,103,104};

        int length=findConsecutiveSequence(arr);
        System.out.println(length);
    }
}

 */