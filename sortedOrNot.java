package Practice;

//array is sorted in ascending order
/*
public class sortedOrNot {
    public static boolean checkArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,21,25,26,30};
        boolean result=checkArray(arr);
        if(result==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
 */


 public class sortedOrNot {
    public static boolean checkArray(int[] arr){
        boolean ascending=true;
        boolean descending=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                ascending=false;
            }
            if(arr[i]>arr[i-1]){
                descending=false;
            }

    }
        return ascending||descending;
}

    public static void main(String[] args) {
        int arr[]={1,0,4,21,25,26,30};
        boolean result=checkArray(arr);
        if(result==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}

