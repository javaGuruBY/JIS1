package com.vladis1350;

public class Palindrome {

    public static boolean isPalindrome(String text){
        text = text.toLowerCase();
        int index = 0;
        char[] arrayChars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                arrayChars[index] = text.charAt(i);
                index++;
            }
        }
        for (int j = 0; j < index; j++){
            if (arrayChars[j] != arrayChars[index - j - 1]){
                return false;
            }
        }
        return  true;
    }
}
