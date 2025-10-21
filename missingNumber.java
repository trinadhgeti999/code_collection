package Practice;

//brute-linear search
//and

//better-hashing
public class missingNumber {
    public static int findMissingNumber(int[] arr){
        int visit[]=new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            visit[arr[i]]=1;
        }

        for(int i=0;i<visit.length;i++){
            if(visit[i]!=1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        int missingNumber=findMissingNumber(arr);
        System.out.println(missingNumber);
    }
}
