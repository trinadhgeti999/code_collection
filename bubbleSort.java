import java.util.Arrays;

public class bubbleSort {
    public static int[] sort(int[] arr){
        
        int n=arr.length;

        for(int i=n-1;i>=1;i--){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
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