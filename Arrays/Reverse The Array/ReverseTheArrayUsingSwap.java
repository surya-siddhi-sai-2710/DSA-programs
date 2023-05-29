// in this we are using the swapping method to reverse the array
import java.util.*;

public class ReverseTheArrayUsingSwap
{   
        public static void reverseArray(int arr[], int n){
            int temp;
            int start = 0;
            int end = n-1;
            while(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return ;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ;i<n ; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr,n);
        System.out.println("reversed array: ");
        for(int i=0 ;i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
