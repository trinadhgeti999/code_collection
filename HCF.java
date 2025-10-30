package Practice;

public class HCF {
    public static int findHCF(int x,int y){
        int largest=Math.max(x, y);

        int hcf=1;
        for(int i=1;i<=largest;i++){
            if(x%i==0 && y%i==0){
                hcf=Math.max(hcf, i);
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        int x=24;
        int y=6;
        int HCF=findHCF(x, y);
        System.out.println(HCF);
    }
}
