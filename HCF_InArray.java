package Practice;

public class HCF_InArray {
    public static int findGCD(int[] arr) {
        int i=0;
        int smallest=arr[i];
        int largest=arr[i];
        int HCF=1;

        for(i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        for(int j=1;j<=largest;j++){
            if(smallest%j==0 && largest%j==0){
                HCF=Math.max(HCF, j);
            }
        }

        return HCF;
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,9,12};

        int result=findGCD(arr);
        System.out.println(result);
    }
}
