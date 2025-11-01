import java.util.Arrays;

public class quickSort {
public static void sort(int[] arr,int low,int high){

        if(low<high){
            int pivotIndex=partition(arr, low, high);
            sort(arr, low, pivotIndex-1);
            sort(arr, pivotIndex+1, high);
        }      
    }

    public static int partition(int[] arr,int low,int high){

        int i=low;
        int j=high;
        int pivot=arr[low];

        while (i<j) {
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;//pivot index
    }

    public static void main(String[] args) {
        int arr[]={110, 100, 0};

        int low=0;
        int high=arr.length-1;
        sort(arr,low,high);
        System.out.print(Arrays.toString(arr));
    }
}
