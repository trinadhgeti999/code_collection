package Practice;


//better
public class secondLargest {
    public static void main(String[] args) {
        int nums[]={1,2,4,6,4,4,7,7,5,10,9};
        int result=secondLargestElement(nums);
        System.out.println(result);
    }

    public static int secondLargestElement(int[] nums){
        int lnumber=nums[0];
        //int slargestnumber=-1;
        int slargestnumber=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>lnumber){
                lnumber=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>slargestnumber && nums[i]<lnumber){
                slargestnumber=nums[i];
            }
        }
        return slargestnumber;
    }
}
