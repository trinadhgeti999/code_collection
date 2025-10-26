package Practice;

public class reverseWordsInString {
    public static String reverseWords(String s) {
        String words[] = s.split(" ");
        
        for(int i=0;i<words.length;i++){
            words[i]=new StringBuilder(words[i]).reverse().toString();
        }

        String ans=String.join(" ",words);
        return ans;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String result=reverseWords(s);
        System.out.println(result);
    }
}
