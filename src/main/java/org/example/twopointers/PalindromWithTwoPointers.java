package org.example.twopointers;

public class PalindromWithTwoPointers {
    public boolean isPalindrom(String word){
        int start = 0;
        int end = word.length() - 1;
        while(start < end) {
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start += 1;
            end -=1;
        }
        return true;
    }
}
