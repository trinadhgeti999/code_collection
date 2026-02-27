public class Factors {
    public static void main(String[] args){
        int num=36;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                if(num/i!=i)
                System.out.print(num/i+" ");
            }
        }
    }
}
