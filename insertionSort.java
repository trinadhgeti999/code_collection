import java.util.Arrays;

public class insertionSort {
public static int[] sort(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={3,6,3,7,8,2,1,0};

        int sortedArray[]=sort(arr);
        System.out.print(Arrays.toString(sortedArray));
    }
    
}
