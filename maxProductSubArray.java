package Practice;
//optimal 
public class maxProductSubArray {
    public static int maxProduct(int[] arr) {
        
        int maxProduct=Integer.MIN_VALUE;
        int currentProduct=Integer.MIN_VALUE;

        int prefProduct=1;
        int sufProduct=1;

        int n=arr.length;
        for(int i=0;i<n;i++){
            
            prefProduct*=arr[i];
            sufProduct*=arr[n-i-1];

            maxProduct=Math.max(maxProduct,Math.max(prefProduct, sufProduct));
            
            if(arr[i]==0) prefProduct=1;
            if(arr[n-i-1]==0) sufProduct=1;

            // currentProduct=Math.max(prefProduct, sufProduct);
            // maxProduct=Math.max(currentProduct,maxProduct);
            
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int arr[] = {-2,0,-1};
        int result=maxProduct(arr);
        System.out.println(result);
    }
}

//brute ->n²
