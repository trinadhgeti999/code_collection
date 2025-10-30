package Practice;

//Input: nums = [1,2,2,4] ;length arr is n
//Output: [2,3] ->2 is repeating and 3 is missing in 1 to n

import java.util.Arrays;

public class missingAndRepeatingNumber {
    public static int[] find(int[] arr){
        
        /*
        //better
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
        */

        //optimal

        int temp[]=new int[2];
        int n=arr.length;

        int sn=(n*(n+1))/2;
        int s2n=(n*(n+1)*((2*n)+1))/6;

        int s=0;
        int s2=0;

        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            s2+=arr[i]*arr[i];
        }

        int val1=s-sn;//x-y
        int val2=s2-s2n;
        val2=val2/val1;//x+y

        int x=(val1+val2)/2;//repeating number
        int y=val2-x;//missing number

        temp[0]=x;
        temp[1]=y;

        return temp;

    }

    public static void main(String[] args) {
        int arr[]={4,3,2,6,1,1};
        int resultArray[]=find(arr);
        System.out.print(Arrays.toString(resultArray));
    }
}
