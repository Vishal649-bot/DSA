import java.util.Scanner;

class Solution{
    public void rotate(int[] arr, int k){
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

public class ArrayMaker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of elemnt in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the number");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }

        System.out.println("Enter number of time array should rotate");
        int k = sc.nextInt();

        //sol
        Solution sol = new Solution();
        sol.rotate(arr, k);

        // Print the rotated array
        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
