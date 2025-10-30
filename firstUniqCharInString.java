package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
public class firstUniqCharInString {
    public static int firstUniqChar(String s) {

        /*
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
        */

        //works only for a-z(lowercase) or A-z(uppercase) letters
        int freq[]=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String s = "leetcode";
        int result=firstUniqChar(s);
        System.out.println(result);
    }
}
