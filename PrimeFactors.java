public class PrimeFactors {
    public static void main(String[] args){
        int num=76;

        for(int i=2;i*i<=num;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }

        if(num>1){
            System.out.print(num);
        }
    }
}
