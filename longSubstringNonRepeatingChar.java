package Practice;

import java.util.HashSet;
import java.util.Set;

public class longSubstringNonRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set =new HashSet<>();

        int maxCount=0;
        int i=0;
        int j=0;
        //int count=0;
        while (j<s.length()) {
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                //count++;
                j++;

                //if(count>maxCount) maxCount=count;
                maxCount=Math.max(maxCount,set.size());

            }else{
                set.remove(s.charAt(i));
                i++;
                //count--;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length=lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
