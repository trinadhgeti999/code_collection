//Dutch National Flag problem (0,1,2 sorting in O(n), O(1))
import java.util.Scanner;

public class PreQuestion1_TCS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers separated by comma");
        String s=sc.nextLine();
        String StrArray[]=s.split(",");
        int len=StrArray.length;

        int Arr[]=new int[len];
        for(int i=0;i<len;i++){
            Arr[i]=Integer.parseInt(StrArray[i]);
        }

        int i=0;
        int j=0;
        int k=len-1;

        while(j<=k){
            if(Arr[j]==1){
                j++;
            }else if(Arr[j]==0){
                int temp=Arr[j];
                Arr[j]=Arr[i];
                Arr[i]=temp;
                i++;
                j++;
            }else{
                int temp=Arr[j];
                Arr[j]=Arr[k];
                Arr[k]=temp;
                k--;
            }
        }

        for(int x=0;x<len;x++){
            System.out.print(Arr[x]);
            if(x!=len-1)
                System.out.print(",");
        }
        sc.close();
    }
}
