package service;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        boolean palindrome = false;
        char[] arrayChar = string2CharConverter(text);
        for (int i = 0; i < arrayChar.length / 2 - 1; i++) {
            if (arrayChar[i] != arrayChar[arrayChar.length - i - 1]) {
                return false;
            } else {
                palindrome = true;
            }
        }
        return palindrome;
    }

    static char[] string2CharConverter(String text) {
        text = text.toUpperCase();
        char[] arrayChar = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                arrayChar[i] = text.charAt(i);
            }
        }
        return arrayChar;
    }
}
