//Sum of factorial of digits = number

public class StrongNumber {
    public static int factorial(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=40585;
        int sum=0;
        int temp_num=num;
        while(temp_num>0){
            int digit=temp_num%10;
            sum+=factorial(digit);
            temp_num=temp_num/10;
        }

        if(sum==num){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a strong number");
        }
    }
}
