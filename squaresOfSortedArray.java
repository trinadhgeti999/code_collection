package Practice;

import java.util.Arrays;

public class squaresOfSortedArray {
    public static int[] sortedSquares(int[] arr){
        int length=arr.length;
        int temp[]=new int[length];

        int j=0;
        int k=length-1;
        int i=length-1;

        while (j<=k) { 
            int leftSquare=arr[j]*arr[j];
            int rightSquare=arr[k]*arr[k];
            if(leftSquare>rightSquare){
                temp[i]=leftSquare;
                j++;
            }else{
                temp[i]=rightSquare;
                k--;
            }
            i--;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};

        int sortedSquaresArray[]=sortedSquares(arr);
        System.out.print(Arrays.toString(sortedSquaresArray));
    }
}


//brute -> square-store(extra space)-sort-print