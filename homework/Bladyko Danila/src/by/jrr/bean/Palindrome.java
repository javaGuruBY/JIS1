package by.jrr.bean;

public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] arrayOfChars = new char[s.length()];
        int size = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                arrayOfChars[size++] = s.charAt(i);
            }
        }
        int legnth = size / 2;
        for(int i = 0; i < legnth; i++) {
            if(arrayOfChars[i] != arrayOfChars[size - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
