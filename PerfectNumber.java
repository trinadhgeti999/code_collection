//A number whose sum of proper divisors = number itself

//opimised-o(root n)
public class PerfectNumber {
    public static void main(String[] args) {
        int num=6;
    
        if(num <= 1){
            System.out.println("Not a perfect number");
            return;
        }
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                sum+=i;

                if(i!=num/i){
                    sum+=num/i;
                }
                // sum+=num/i;
                // if(num/i==i){
                //     sum-=i;
                // }
            }
            
        }

        if(sum==num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}


/*
//brute
public class PerfectNumber {
    public static void main(String[] args) {
        int num=-496;
        int sum=0;
        if(num <= 1){
            System.out.println("Not a perfect number");
            return;
        }

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
*/