package Practice;

public class palindrome {
    public static boolean isPalindrome(int x) {
        int originalNumber=x;
        int temp=x;
        int sum=0;
        while(temp>0){
            int remainder=temp%10;
            sum=sum*10+remainder;
            temp/=10;
        }

        if (originalNumber!=sum) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x=12621;
        boolean result=isPalindrome(x);
        if(result==true){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
