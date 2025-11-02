//array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

public class findSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int low=0;
        int high=n-1;
        char nextChar=letters[0];

        while(low<=high){
            int mid=(low+high)/2;
            if(letters[mid]>target){
                nextChar=letters[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return nextChar;
    }
    public static void main(String[] args) {
        char letters[] = {'c','f','j'};
        char target = 'g';

        char result=nextGreatestLetter(letters, target);
        System.out.println(result);
    }
}
