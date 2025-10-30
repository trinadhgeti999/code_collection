package Practice;

import java.util.Arrays;


public class movesZeroesEnd {
    public static int[] filterArray(int[] arr){
         int index=0;
         int i=0;
         while(i<arr.length){
            if(arr[i]!=0){
                arr[index]=arr[i];
                if(i>index){
                    arr[i]=0;
                }
                i++;
                index++;
            }else{
                i++;
            }
         }
         return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,0,3,12};
        int modifiedArray[]=filterArray(arr);
        System.out.println(Arrays.toString(modifiedArray));
    }
}
/*
//brute - using extra space
public class movesZeroesEnd {
    public static int[] filterArray(int[] arr){
        int index=0;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }
        return temp;  
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int modifiedArray[]=filterArray(arr);
        System.out.println(Arrays.toString(modifiedArray));
    }
}
 */

