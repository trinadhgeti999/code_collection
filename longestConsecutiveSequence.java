package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//brute-linear search
//and
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
