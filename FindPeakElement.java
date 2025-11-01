//A peak element is an element that is strictly greater than its neighbors.
// If the array contains multiple peaks, return the index to any of the peaks.
//

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int n=arr.length;

        if(n==1) return 0;

        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;

        int low=1;
        int high=n-2;
        while(low<=high){
            
            int mid=low+(high-low)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else{
                //low=mid+1;
                high=mid-1;
            }    
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};

        int peak=findPeakElement(arr);
        System.out.println(peak);
    }
}

/*
//brute-o(n)
public class FindPeakElement {
    public static int findPeakElement(int[] arr) {

        if(arr.length==0) return -1;

        // for (int i = 0; i < arr.length; i++) {
        //     if ((i == 0 || arr[i - 1] < arr[i]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
        //         return i;
        //     }
        // }

        for(int i=0;i<arr.length;i++){ 
            if(i==0){
                if(arr[i]>arr[i+1]){
                    return i;
                }else{
                    continue;
                }
            }

            if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    return i;
                }else{
                    continue;
                }
            }

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }   
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,5,6,4};

        int peak=findPeakElement(arr);
        System.out.println(peak);
    }
}
*/