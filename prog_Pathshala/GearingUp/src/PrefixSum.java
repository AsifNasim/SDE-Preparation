import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int [] prefixSum = prefixSumInPlace(arr);
        int query = s.nextInt();
        while (query-- >0){
            int leftIndex = s.nextInt();
            int rightIndex = s.nextInt();
            int sum = subArray(prefixSum, leftIndex, rightIndex);
            System.out.println(sum);
        }

    }
//     sum of subarray with startIndex and endIndex
     static int subArray(int[] prefixSum, int leftIndex, int rightIndex) {
        if(leftIndex == 0){
            return prefixSum[rightIndex];
        }
         int sum = prefixSum[rightIndex] - prefixSum[leftIndex - 1];
         return sum;
    }

    static int[] prefixSumInPlace(int[] arr) {

//        Calculation of prefix sum
         for (int i = 1; i < arr.length ; i++) {
             arr[i] += arr[i-1];
         }

         return arr;

    }
}
