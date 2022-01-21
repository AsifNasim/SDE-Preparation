import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(findMin(arr));
    }

     static int findMin(int[] arr) {

        int minVal = Integer.MAX_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] < minVal){
                 minVal = arr[i];
             }
         }

         return minVal;
    }
}
