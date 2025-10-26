package Practice;

//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

public class maxNo_OfVowelsInSubstring {
    public static int maxVowels(String s,int k) {

        int maxCount=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxCount++;
            }
        }

        int currentcount=maxCount;
        int i=0;
        int j=k;

        while (j<s.length()) {

            if(maxCount==k) return maxCount;

            if(checkvowel(s.charAt(i))){
                currentcount--;
            }

            if(checkvowel(s.charAt(j))){
                currentcount++;
            }

            if(currentcount>maxCount){
                maxCount=currentcount;
            }

            i++;
            j++;

        }
        return maxCount;
    }

    public static boolean checkvowel(char ch){
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
            }
            return false;
    }
    
    public static void main(String[] args) {
        String s = "zpuerktejfp";
        int k = 3;

        int result=maxVowels(s,k);
        System.out.println(result);

    }
}

/*
//brute
public class maxNo_OfVowelsInSubstring {
    public static int maxVowels(String s,int k) {
        String[] words=new String[s.length()-k+1];
        
        for(int i=0 ;i<=s.length()-k;i++){
            words[i]=s.substring(i,i+k);
        }

        int maxcount=0;
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            int currentcount=0;

            for(int j=0;j<k;j++){
                char ch=temp.charAt(j);
                if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
                    currentcount++;
                    if(currentcount>maxcount){
                        maxcount=currentcount;
                    }
                }
            }
        }
        return maxcount;

    }
    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;

        int result=maxVowels(s,k);
        System.out.println(result);

    }
}

*/