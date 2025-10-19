package Practice;

import java.util.Arrays;

public class rotateArrayRightByK_Steps {
    public static int[] rotateArray(int[] arr,int k){
        k=k%arr.length;
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        return arr;
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=4;
        int newArray[]=rotateArray(arr,k);
        System.out.println(Arrays.toString(newArray));
    }
}


/*
//brute
public class rotateArrayRightByK_Steps {
    public static int[] rotateArray(int[] arr,int k){
        int temp[]=new int[arr.length];
        k = k % arr.length;
        int n=(arr.length)-k;
        int index=0;
        for(int i=n;i<arr.length;i++){
            temp[index]=arr[i];
            index++;
        }
        for(int i=0;i<n;i++){
            temp[index]=arr[i];
            index++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={-1,-100,3,99};
        int k=2;
        int newArray[]=rotateArray(arr,k);
        System.out.println(Arrays.toString(newArray));
    }
}

*/

