package Practice;

import java.util.ArrayList;
import java.util.List;


//allowed duplicates
/*
//brute
public class intersectionTwoSortedArrays {
    public static List<Integer> intersection(int[] arr1,int[] arr2){
        List<Integer> list=new ArrayList<>();
        int visit[]=new int[arr2.length];

        outer:
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(visit[j]!=1){
                        list.add(arr1[i]);
                        visit[j]=1;
                        continue outer;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        int arr1[]={1,2,2,3,5,6,7,7};
        int arr2[]={2,3,5,5,6,7,9};

        List<Integer> resultArray=intersection(arr1,arr2);
        System.out.println(resultArray);
    }
}
*/

public class intersectionTwoSortedArrays {
    public static List<Integer> intersection(int[] arr1,int[] arr2){
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;j++;
            }
        }
        return list;
    }

    public static void main(String[] args){
        int arr1[]={1,2,2,3,5,6,7,7};
        int arr2[]={2,3,5,5,6,7,9};

        List<Integer> resultArray=intersection(arr1,arr2);
        System.out.println(resultArray);
    }
}


//without duplicates
/*
Set<Integer> set1=new LinkedHashSet<>();
Set<Integer> set2=new LinkedHashSet<>();

        for(int it:nums1){
            set1.add(it);
        }

        for(int it:nums2){
            if(set1.contains(it)){
                set2.add(it);
            }
        }

    int[] result=new int[set2.size()];
    int index=0;

    for(int it:set2){
        result[index++]=it;
    }
    return result;
    }

 */