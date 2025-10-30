package Practice;

//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

public class palindrome11 {
     public static boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j){

            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                if(isPalindromeRange(s,i+1,j) || isPalindromeRange(s,i,j-1)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPalindromeRange(String s,int left ,int right){
        while (left<right) {
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "axbcbaba";
        boolean result=validPalindrome(s);

        if(result==true){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
