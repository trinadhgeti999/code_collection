package Practice;

public class validPalindrome {
    public static boolean isPalindrome(String s) {

        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");

        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }    
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result=isPalindrome(s);

        if(result==true){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
