package Practice;

public class fibonacciSum{
    public static int Sum(int n) {
        int a=0;
        int b=1;

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int finSum=a+b;
        for(int i=2;i<n;i++){
            int temp=a+b;
            a=b;
            b=temp;
            finSum+=temp;
        }
        return finSum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Sum(n);
        System.out.println(result);
    }
}
