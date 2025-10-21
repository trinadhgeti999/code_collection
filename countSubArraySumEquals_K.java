package Practice;

//brute
public class countSubArraySumEquals_K {
    public static int findLongestSubArrayLength(int[] arr,int k){

        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){ 
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
            sum=0;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        int length=findLongestSubArrayLength(arr,k);
        System.out.println(length);
    }
}
