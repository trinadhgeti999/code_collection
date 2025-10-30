package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//using map- works for all mix characters
public class ValidAnagram {
    public static boolean isAnagram(String s1, String s2) {
        /*
        Map<Character,Integer> s1map=new HashMap<>();
        Map<Character,Integer> s2map=new HashMap<>();

        for(char ch:s1.toCharArray()){
            s1map.put(ch, s1map.getOrDefault(ch,0)+1);
        }

        for(char ch:s2.toCharArray()){
            s2map.put(ch, s2map.getOrDefault(ch,0)+1);
        }

        if(s1map.equals(s2map)) return true;

        return false; 
        */

        Map<Character,Integer> s1map=new HashMap<>();

         for(char ch:s1.toCharArray()){
            s1map.put(ch, s1map.getOrDefault(ch,0)+1);
        }

        for(char ch:s2.toCharArray()){
            if(!s1map.containsKey(ch) || s1map.get(ch)==0){
                return false;
            }else{
                s1map.put(ch, s1map.get(ch)-1);
            }
        }

        for (int count : s1map.values()) {
            if (count>0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "1afdf";
        String s2 = "daff1";

        boolean result=isAnagram(s1, s2);

        if(result==true){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}


/*
//works only for a-z(lowercase) or A-z(uppercase) letters

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
*/