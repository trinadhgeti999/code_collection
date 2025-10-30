//Linear search -> works for both sorted and unsorted arrays

public class linearSearch {
public static int search(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,6,3,7,8,2,1,0};
        int element=7;
        int index=search(arr,element);

        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.print("Element found at index "+index);
        }
    }
}
