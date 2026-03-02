public class LCM {
    public static void main(String[] args) {
        
        int num=48;
        int num2=0;
        int a=num;
        int b=num2;
        
        if(a == 0 || b == 0){
        System.out.println(0);
        return;
    }
        
        while(num2>0){
            int rem=num%num2;
            num=num2;
            num2=rem;
        }

        int hcf=num;
        //hcf*lcm=a*b
        int lcm=(a/hcf)*b;//(a*b)/hcf; ->instead of this ; to reduce overflow
        System.out.println(lcm);
    }
}
