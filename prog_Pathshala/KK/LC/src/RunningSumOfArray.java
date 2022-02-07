import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int [] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

     static int[] runningSum(int[] arr) {
        int [] newArr = new int[arr.length];
        newArr[0] = arr[0];
         for (int i = 1; i < arr.length ; i++) {
             newArr[i] = arr[i] + newArr[i-1];
         }

         return newArr;
    }
}
