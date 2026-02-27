//If a number n has d last_digitss, the last d last_digitss of n2(square) must equal to n.
public class AutomorphicNumber {
    public static void main(String[] args) {
        int num=376;
    
        int count=0;
        int orig_num=num;
        if(num==0){
            count=1;
        }else{
            while(orig_num>0){
                orig_num=orig_num/10;
                count++;
            }
        }

        int square_num=num*num;
        int last_digits=square_num%(int)Math.pow(10, count);
        
        if(last_digits==num){
            System.out.println("It is an Automorphic number");
        }else{
            System.out.println("Not an Automorphic number");
        }
    }
}

/*
while(num > 0){
    if(num % 10 != square % 10){
        System.out.println("Not Automorphic");
        return;
    }
    num /= 10;
    square /= 10;
}
System.out.println("Automorphic");
 */