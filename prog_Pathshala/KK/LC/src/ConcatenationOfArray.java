import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    //    https://leetcode.com/problems/concatenation-of-array
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int [] ans = concatOfArray(arr);
        System.out.println(Arrays.toString(ans));

    }

     static int [] concatOfArray(int[] arr) {
        int [] ans = new int[2*arr.length];
         for (int i = 0; i < arr.length; i++) {
             ans[i] = arr[i];
             ans[i+arr.length] = arr[i];
         }
         return ans;
    }

}
