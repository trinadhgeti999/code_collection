package Practice;

public class nthFibonacciNumber {
    public static int fib(int n) {
        int a=0;
        int b=1;
        
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        for(int i=2;i<=n;i++){
            int temp=0;
            temp=a+b;
            a=b;
            b=temp;
        }
        
        return b;
    }
    public static void main(String[] args) {
        int n = 4;
        int result = fib(n);
        System.out.println(result);
    }
}
