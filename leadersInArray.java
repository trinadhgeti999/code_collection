package Practice;

//learders means -Everything on the right side should be smaller

import java.util.ArrayList;
import java.util.List;

public class leadersInArray {
    public static List<Integer> findLeaders(int[] arr){
        List<Integer> list=new ArrayList<>();

        int l=arr.length;
        int i=l-1;
        int max=Integer.MIN_VALUE;
        
        while (i>=0) {
            if(arr[i]>max){
                max=arr[i];
                list.add(arr[i]);
            }
            i--;
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};

        List<Integer> result=findLeaders(arr);

        System.out.println(result);
    }
}
