package Practice;

import java.util.Arrays;

//leetcode

// given two integer arrays nums1 and nums2, sorted in ascending, and two integers m and n, represent the no. of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in ascending
//nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//no extra space
public class merge_two_sorted_Arrays {
    public static int[] mergeArray(int[] arr1,int[] arr2,int m,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(arr2[j]<arr1[i]){
                arr1[k]=arr1[i];
                k--;
                i--;
            }else{
                arr1[k]=arr2[j];
                k--;
                j--;
            }
        }

        while(j>=0){
            arr1[k]=arr2[j];
            k--;j--;
        }
        return arr1;
    }

    public static void main(String[] args){
        int arr1[]={1,2,3,7,0,0,0};
        int arr2[]={2,5,6};

        int m=4;
        int n=arr2.length;

        int finalArray[]=mergeArray(arr1,arr2,m,n);
        // for(int i:finalArray){
        //     System.out.print(i+" ");
        // }

        System.out.println(Arrays.toString(finalArray));
    }
}
