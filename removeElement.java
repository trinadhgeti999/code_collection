package Practice;
//leetcode
//given array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//in-place means no extra space

public class removeElement {
    public static int length(int[] arr,int val){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={0,1,4,3,4,6,2,6,4};
        int val=4;
        int k=length(arr,val);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]);
        }
    }
}
