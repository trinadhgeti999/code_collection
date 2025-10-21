package Practice;

import java.util.HashMap;
import java.util.Map;

//optimal
public class numberAppearOnes {
    public static int findNumber(int[] arr){
        int xor=0;
        for(int it:arr){
            xor^=it;
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[]={6,9,5,0,0,5,6,1,1};//other numbers must be twice then only xor works
        int number=findNumber(arr);
        System.out.println(number);
    }
}

/*
//better -using hashmap
public class numberAppearOnes {
    public static int findNumber(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(int it:map.keySet()){
            if(map.get(it)==1){
                return it;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={6,9,9,5,0,0,5,6,1,6};
        int number=findNumber(arr);
        System.out.println(number);
    }
}

*/