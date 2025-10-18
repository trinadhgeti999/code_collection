package Practice;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicates {
    public static boolean containsDuplicate(int[] arr) {

        /*
        //brute force->o(n2) time complexity
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
         */

         //o(n) time complexity
        Set<Integer> set=new HashSet<>();
        for(int it:arr){
            if(set.contains(it)){
                return true;
            }
            set.add(it);
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[]={4,2,6,4,7,3,7};
        boolean check=containsDuplicate(arr);
        if(check==true){
            System.out.println("Array contains duplicate elements");
        }else{
            System.out.println("No duplicates");
        }
    }
}




    