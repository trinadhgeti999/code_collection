package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();

        if(s.length()<p.length()) return list;
        
        int pfreq[]=new int[26];
        int sfreq[]=new int[26];

        for(char ch:p.toCharArray()){
            pfreq[ch-'a']++;
        }

        for(int i=0;i<p.length();i++){
            sfreq[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(pfreq, sfreq)) list.add(0);

        int i=0;
        int j=p.length();

        while(j<s.length()){
            sfreq[s.charAt(i)-'a']--;
            sfreq[s.charAt(j)-'a']++;

            if(Arrays.equals(pfreq, sfreq)) list.add(i+1);

            i++;
            j++;
        }

        return list;

    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result=findAnagrams(s,p);
        System.out.println(result);
    }
}
