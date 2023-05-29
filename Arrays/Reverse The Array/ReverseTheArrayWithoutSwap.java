// in this we are reversing the array elements without using swapping method
import java.util.*;
public class ReverseTheArrayWithoutSwap 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ;i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("reversend array: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
