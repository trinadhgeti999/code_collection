package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class unionTwoSortedArrays {

    public static Set<Integer> union(int[] arr1,int[] arr2){
        HashSet<Integer> set=new LinkedHashSet<>();

        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                set.add(arr1[i]);
                i++;
            }else{
                set.add(arr2[j]);
                j++;
            }
        }

        while (i<arr1.length) {
            set.add(arr1[i]);
            i++;
        }
        while (j<arr2.length) {
            set.add(arr2[j]);
            j++;
        }

        // for(int it:set){
        //     System.out.print(it+" ");
        // }

        return set;
    }

    public static void main(String[] args) {
        int arr1[]={1,4,4,5,6,6,8,9};
        int arr2[]={2,2,5,7,8,8,10,11,14,14};
        Set<Integer> unionSet=union(arr1,arr2);//we cannot do indexing to set
        Integer[] unionArray=unionSet.toArray(new Integer[0]);//converting to array for indexing

        System.out.println(unionSet);
    }
}
