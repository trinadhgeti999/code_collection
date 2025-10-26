package Practice;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s1, String s2) {
        int s1freq[]=new int[26];
        int s2freq[]=new int[26];

        for(char ch:s1.toCharArray()){
            s1freq[ch - 'a']++;
        }

        for(char ch:s2.toCharArray()){
            s2freq[ch - 'a']++;
        }

        if(Arrays.equals(s1freq, s2freq)){
            return true;
        } 

        return false;
    }
    public static void main(String[] args) {
        String s1 = "cba";
        String s2 = "abc";

        boolean result=isAnagram(s1, s2);

        if(result==true){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }

    }
}
