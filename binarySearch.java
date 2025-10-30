
public class binarySearch {

public static int search(int[] arr,int element){
        int n=arr.length;

        int start=0;
        int end=n-1;
        while(start<=end){
        int mid=start+(end-start)/2;
            //int mid=(start+end)/2;
            if(arr[mid]==element){
                return mid;
            }else if(element>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,8,9,15,26};
        int element=9;
        int index=search(arr,element);

        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.print("Element found at index "+index);
        }
    }
}


 /*
                                //using recursion
public class binarySearch {
    public static int search(int arr[],int low,int high,int target){
        if(low>high){
            return -1;
        }
             int mid=low+(high-low)/2;
    
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                return search(arr, mid+1, high, target);
            }else{
                
                return search(arr, low, mid-1, target);
            } 
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,16,34,45,76};
        int n=arr.length;
        int target=34;
        int result=search(arr,0,n-1,target);
        if(result!=-1){
            System.out.println("The Element "+target+" is present at index : "+result);
        }else{
            System.out.println("Element not found");
        }
        
    }
}                                
 */