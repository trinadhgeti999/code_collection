//negative numbers , 0 and 1 are neither prime nor composite numbers 
import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        if(isPrime(num)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
        sc.close();
    }

    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;//2 is the only even prime number
        if(num%2==0) return false;

        for(int i=3;i*i<=num;i+=2){//checking only odd numbers
            if(num%i==0){
                return false;
            }
        }

        // if(num<=1) return false;
        // for(int i=2;i*i<=num;i++){
        //     if(num%i==0){
        //         return false;
        //     }
        // }

        return true;
        }
}


/*public class PrimeOrNot {
    public static void main(String[] args) {
        int num=5;
        if(num<=1){
            System.out.println("Number is neither prime nor composite");
            return;
        }

        if(isPrime(num)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        }
}
*/

/*public class PrimeOrNot {
    public static void main(String[] args) {
        int num=-5;
        int sum=0;
        if(num<=1){
            System.out.println("Number is neither prime nor composite");
            return;
        }
            
        for(int i=2;i<num;i++){
                if(num%i==0){
                    sum++;
                }
            }
            if(sum>0){
                System.out.println("it is a not prime number");
            }else{
                System.out.println("Prime number");
            }
        }
}
*/

