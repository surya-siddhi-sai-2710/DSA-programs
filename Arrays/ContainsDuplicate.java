/* leetcode problem "Contains Duplicate"
  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
  
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false
  
*/


import java.util.*;
public class Duplicates{
    public static Boolean checkDuplicates(int[] nums){
        Set tempSet = new HashSet();
        for(int n : nums){
            if(!tempSet.add(n)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter integer array elements to check duplicates: ");
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("If duplicates are present then output is TRUE, else FALSE: ");
        System.out.println(checkDuplicates(nums));
    }
}
