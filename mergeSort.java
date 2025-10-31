import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeSort {
    public static void sort(int[] arr,int low,int high){
        
        if(low==high) return;

        int mid=(low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> list=new ArrayList<>();
        
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high) {
            if(arr[left]>arr[right]){
                list.add(arr[right]);
                right++;
            }else{
                list.add(arr[left]);
                left++;
            }
        }

        while(left<=mid){
            list.add(arr[left]);
            left++;
        }

        while(right<=high){
            list.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,3,7,8,2,1,0};

        int low=0;
        int high=arr.length-1;
        sort(arr,low,high);
        System.out.print(Arrays.toString(arr));
    }
}


/*
public class mergeSort {
public static void merge(int arr[],int low,int mid,int high){
    int templength=high-low+1;
    int temp[]=new int [templength];
    int left=low;
    int right=mid+1;
    int x=0;

    while(left<=mid && right<=high){
        if(arr[right]<=arr[left]){
            temp[x]=arr[right];
            x++;
            right++;
        }else{
            temp[x]=arr[left];
            x++;
            left++;
        }
    }

        while(left<=mid){
            temp[x]=arr[left];
            x++;
            left++;
        }

        while(right<=high){
            temp[x]=arr[right];
            x++;
            right++;
        }

        for(int i=0;i<templength;i++){
            arr[low+i]=temp[i];
        }
}

public static void divide(int arr[],int low,int high){

    int mid=(low+high)/2;

    if(low>=high){
        return;
    }

    divide(arr, low, mid);
    divide(arr,mid+1,high);
    merge(arr,low,mid,high);
    
}

    public static void main(String[] args){
        int arr[]={3,45,7,1,9,0};
        int n=arr.length;
        divide(arr,0,n-1);

        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}

 */