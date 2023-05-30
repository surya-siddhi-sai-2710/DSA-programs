// input = "Hello"
// output = "olleH"

import java.util.*;

public class ReverseString
{   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        for(int i=0; i<sb.length()/2 ; i++){
            int front = i;
            int end = sb.length() - 1 - i;
            
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(end);

            sb.setCharAt(front, backChar);
            sb.setCharAt(end, frontChar);
        }
        System.out.println(sb);
    }
}
