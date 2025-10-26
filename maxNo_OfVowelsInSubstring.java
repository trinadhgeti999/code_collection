package Practice;

//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

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
