package Practice;

public class mergeTwoSortedArrays {
    public static int[] mergeArray(int[] arr1,int[] arr2,int n,int m){

        int arr3[]=new int[n+m];
        int i=0;
        int j=0;
        int index=0;

        while(i<n && j<m){
            if(arr2[j]<arr1[i]){
                arr3[index]=arr2[j];
                j++;index++;
            }else{
                arr3[index]=arr1[i];
                i++;index++;
            }
        }

        while (i<n) {
            arr3[index]=arr1[i];
            i++;index++;
        }
        while (j<m) {
            arr3[index]=arr2[j];
            j++;index++;
        }
        return arr3;
    }
 
    public static void main(String[] args){
        int arr1[]={1,3,5,6,9};
        int arr2[]={2,3,5,9,10};
        int n=arr1.length;
        int m=arr2.length;

        int finalArray[]=mergeArray(arr1,arr2,n,m);
        for(int i:finalArray){
            System.out.print(i+" ");
        }
    }
}
