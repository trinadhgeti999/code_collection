
//selection sort
import java.util.Arrays;

public class selectionSort {
    public static int[] sort(int[] arr){
        
        int n=arr.length;

        for(int i=0;i<n-2;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }

            //swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        } 
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={3,6,3,7,8,2,1,0};

        int sortedArray[]=sort(arr);
        System.out.print(Arrays.toString(sortedArray));
    }
}