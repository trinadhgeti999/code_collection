package Practice;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
/*
//for sorted array
public class removeDuplicates {
    public static int remove(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,7,9,9,10};
        int filterArray=remove(arr);
        for(int i=0;i<filterArray;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
 */

 //brute-for unsorted
 public class removeDuplicates {
    public static int remove(int[] arr){
        // Set<Integer> set=new HashSet<>(); //->unordered
        Set<Integer> set=new LinkedHashSet<>(); //ordered
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int index=0;
        for(Integer it : set) {
            arr[index]=it;
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,7,9,9,10,11,34,11};
        int filterArray=remove(arr);
        for(int i=0;i<filterArray;i++){
            System.out.print(arr[i]+" ");
        }   
    }
}