//I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).

public class guessNumberHigherOrLower {
    public static int guessNumber(int n) {
        int low=1;
        int high=n;

        while(low<=high){
            //int mid=(low+high)/2;
            int mid=low+(high-low)/2;
            int result=guess(mid);
            if(result==-1){
                high=mid-1;
            }else if(result==1){
                low=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int guess(int num){
        int picked=1;
        if(num>picked){
            return-1;
        }else if(num<picked){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int pickedNumber=guessNumber(10);
        System.out.println(pickedNumber);
    }
}
