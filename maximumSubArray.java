package Practice;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.


public class maximumSubArray {
    public static int findMaximumSubArray(int[] arr){
        int max_value=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max_value){
                max_value=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
       return max_value;
    }
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int sum=findMaximumSubArray(arr);
        System.out.println(sum);
    }
    
}


/*
//brute
public class maximumSubArray {
    public static int findMaximumSubArray(int[] arr){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int current_sum=0;
            for(int j=i;j<arr.length;j++){
                current_sum+=arr[j];
                if(current_sum>max_sum){
                    max_sum=current_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int sum=findMaximumSubArray(arr);
        System.out.println(sum);
    }
    
}
*/

