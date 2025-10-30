package Practice;

//optimal
public class largest{
    public static void main(String[] args){
        int nums[]={1,2,5,3,7,4,0,45};
        int result=largestElement(nums);
        System.out.println(result);
    }

    public static int largestElement(int[] nums) {
        int lnumber=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>lnumber){
                lnumber=nums[i];
            }
        }
        return lnumber;
    }
}
