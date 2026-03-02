import java.util.*;
public class Main{
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String [] args){
        String s = "racecar";
       if(isPalindrome(s,0, s.length()-1))
           System.out.println("Palindrome");
       else
           System.out.println("Not a palindrome");
    }
}