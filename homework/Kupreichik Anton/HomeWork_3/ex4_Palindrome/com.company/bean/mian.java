package com.company.bean;

import com.company.service.PalindromeService;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();
        String str1 = "Madam, I'm Adam!";
        System.out.println(palindromeService.isPalindrome(str1));
    }
}
