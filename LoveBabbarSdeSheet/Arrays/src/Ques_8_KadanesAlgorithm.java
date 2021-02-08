import java.util.Scanner;

public class Ques_8_KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int ans = maxSumSubArray(arr);
        System.out.println(ans);
    }

    private static int  maxSumSubArray(int[] arr) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            localMax = Math.max(arr[i], (arr[i]+localMax));
            if(localMax > globalMax){
                globalMax = localMax;
            }
        }

        return globalMax;
    }
}
