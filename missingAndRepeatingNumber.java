package Practice;

//Input: nums = [1,2,2,4] ;length arr is n
//Output: [2,3] ->2 is repeating and 3 is missing in 1 to n

import java.util.Arrays;

public class missingAndRepeatingNumber {
    public static int[] find(int[] arr){
        
        int temp[]=new int[2];
        int hash[]=new int[arr.length+1];

        for(int i=1;i<hash.length;i++){
            hash[arr[i-1]]++;
        }

        for(int i=1;i<hash.length;i++){
            if(hash[i]==2){
                //repeatingNumber=i
                temp[0]=i;
            }
            if(hash[i]==0){
                //missingNumber=i;
                temp[1]=i;
            }    
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,6,1,1};
        int resultArray[]=find(arr);
        System.out.print(Arrays.toString(resultArray));
    }
}
