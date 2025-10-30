package Practice;

public class maxConsecutiveOnes {

    public static int find(int[] arr){
        int maxCount=0;
        int currentCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currentCount++;
                if(maxCount<currentCount){
                    maxCount=currentCount;
                }
            }else{
                currentCount=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        int maxConOnes=find(arr);
        System.out.println(maxConOnes);
    }
}
