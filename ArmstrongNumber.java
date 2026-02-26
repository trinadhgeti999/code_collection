import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        int original_num=num;
        int count=0;
        if(num==0) count=1;
        while(original_num>0){
            original_num=original_num/10;
            count++;
        }

        int sum=0;
        int org_num=num;
        while(org_num>0){
            int quotient=org_num%10;
            org_num=org_num/10;
            sum=sum+(int)Math.pow(quotient,count);
        }

        if(sum==num){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
