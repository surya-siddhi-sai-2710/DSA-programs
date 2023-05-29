// if the original string and reversed string are equal, then the original string is said to be palindrome string
// example: BOB
import java.util.*;

public class Palindrome
{   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = sc.nextLine();
        
        System.out.print("original string: "+name);
        System.out.println();
        String name2 = "";
        for(int i=name.length() - 1; i>=0; i--){
            name2 += name.charAt(i);
        }
        System.out.print("reversed string: "+ name2);
        System.out.println();
        if(name.compareTo(name2) == 0){
            System.out.println(name + " is palindrome string");
        }
        else{
            System.out.println(name+ " is NOT plaindrome string");
        }
    }
}
