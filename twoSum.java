package Practice;

import java.util.ArrayList;
import java.util.List;

public class twoSum {

    public static int[] find(int[] arr,int target){
        int inarr[]=new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    inarr[0]=i;
                    inarr[1]=j;
                    return inarr;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=26;
        int resultArr[]=find(arr,target);
        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]);
        }
    }
}


/*
//Arraylist
public class twoSum {
    public static List<Integer> find(List<Integer>arr,int target){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // int arr[]={2,7,11,15};
        List<Integer> arr=new ArrayList<>(List.of(2,7,11,15));
        int target=26;
        List<Integer> result = find(arr, target);
        System.out.println(result); 
    }
}

 */