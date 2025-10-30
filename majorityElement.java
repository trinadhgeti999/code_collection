package Practice;

import java.util.HashMap;

public class majorityElement {
    public static int find(int arr[]){
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=(arr.length)/2;
        
        for(int i=0;i<arr.length;i++){
            hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
        }

        for(Integer key:hash.keySet()){
            if(hash.get(key)>n){
                return key;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={3,2,3};
        int mElement=find(arr);
        System.out.print(mElement);
    }
}

/*
//brute
public class majorityElement {
    public static int find(int arr[]){
        int n=(arr.length)/2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n){
                return arr[i];
            }else{
                count=0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,2,3};
        int mElement=find(arr);
        System.out.print(mElement);
    }
}

 */


 /*
 public class majorityElement {
    public static int find(int arr[]){
        int n=(arr.length)/2;
        int hash[]=new int[4];//size depends on range of numbers

        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]>n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int mElement=find(arr);
        System.out.print(mElement);
    }
}

 */

 