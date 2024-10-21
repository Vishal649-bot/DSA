import java.util.Scanner;

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        
        //now use for loop to find the max term
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
        
    }
}

public class ArrayMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the nuber of element in your array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the nuber of element");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int sol = Solution.largest(arr);
        System.out.println("largest"+sol);
        sc.close();
    }
}