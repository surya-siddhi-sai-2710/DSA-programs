/*
This Problem is taken from LeetCode "Valid Palindrome"

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Example: Input: s = "A man, a plan, a canal: Panama"
         Output: true
         Explanation: "amanaplanacanalpanama" is a palindrome.
         
 Here we used regular expression methods to remove non-alphanumeric elements
 
*/

import java.util.*;

public class ValidPalindrome
{   

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s =  sc.nextLine();

        String s1 = s.replaceAll("[^a-zA-Z0-9]+", "");
        s1 = s1.replace("\\s", "");
        s1 = s1.toLowerCase();

        if(isPalindrome(s1)){
            System.out.println(s+" is Plaindrome");
        }
        else{
            System.out.println(s+" is NOT Palindrome");
        }

    }
}
