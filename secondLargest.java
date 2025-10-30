package Practice;

/*
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

 */

//optimal

public class secondLargest {
    public static int secondLargestElement(int[] nums){
        int largest=nums[0];
        int slargest=Integer.MIN_VALUE;
        if(nums.length>=2){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                slargest=largest;
                largest=nums[i];
            }else if(nums[i]>slargest && nums[i]<largest){
                slargest=nums[i];
            }
        }

        if(slargest==Integer.MIN_VALUE){
            System.out.println("Elements are equal");
            return -1;
        }
    }else{
        System.out.println("Array size must greater than 1 to compare elements");
        return -1;
    }
        return slargest;
    }

    public static void main(String[] args) {
        //int nums[]={1,2,4,6,11,4,4,7,7,5,11,10,9};
        int nums[]={2};
        int result=secondLargestElement(nums);
        System.out.println(result);
    }
}

