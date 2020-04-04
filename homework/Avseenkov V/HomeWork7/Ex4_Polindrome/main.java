import service.Palindrome;
import test.PalindromeTest;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println(Palindrome.isPalindrome("Sum SumMus mus"));
        System.out.println(Palindrome.isPalindrome("asdfghjkl"));

        PalindromeTest test = new PalindromeTest();
        test.runTest();
    }
}
