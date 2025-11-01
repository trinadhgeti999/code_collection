import java.util.Arrays;

public class findFirstAndLastPositionOfEleInSortArray {
    public static int[] searchRange(int[] arr, int element) {
        int n=arr.length;
        int range[]=new int[]{-1,-1};

        int start=0;
        int end=n-1;
        while(start<=end){
        int mid=start+(end-start)/2;
            //int mid=(start+end)/2;
            if(arr[mid]==element){
    
                int startindex=mid;
                while (startindex>0 && arr[startindex-1]==element ) {
                    startindex--;
                }
                range[0]=startindex;

                int endindex=mid;
                while(endindex<n-1 && arr[endindex+1]==element){
                    endindex++;
                }
                range[1]=endindex;

                return range;

            }else if(element>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return range;
    }
    public static void main(String[] args) {
        int arr[]={1};
        int element=0;
        int indexRange[]=searchRange(arr, element);

        System.out.println(Arrays.toString(indexRange));
    }
}
