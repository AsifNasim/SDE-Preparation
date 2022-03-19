import java.util.Arrays;
import java.util.Scanner;

public class ReturnMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//        System.out.println(maxElemAtIndexOfSubArray(arr,index));

        int [] maxArray = maxElemAtIndex(arr);

        int query = s.nextInt();
        while (query-- > 0) {
            int index = s.nextInt();
            System.out.println(maxAtIndex(maxArray, index));
        }
        System.out.println(Arrays.toString(maxArray));


    }

    private static int maxAtIndex(int[] maxArray, int index) {
        return maxArray[index];
    }

    static int[] maxElemAtIndex(int[] arr) {

         for (int i = 1; i < arr.length ; i++) {
             if(arr[i] < arr[i-1]){
                 arr[i] = arr[i-1];
             }
         }
         return arr;
    }

    static int maxElemAtIndexOfSubArray(int[] arr, int index) {
        int maxElem = Integer.MIN_VALUE;

        if(arr[0] > maxElem && index == 0){
            maxElem = arr[0];
            return maxElem;
        }

         for (int i = 1; i < arr.length; i++) {
             arr[i] += arr[i-1];
             if(arr[i] > maxElem && index == i){
                 maxElem = arr[i];
                 return maxElem;
             }
         }
         return -1;
    }



}
