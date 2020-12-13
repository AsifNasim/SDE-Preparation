import java.util.Arrays;
import java.util.Scanner;

public class Ques_7_SecondLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//        int ans = secondLargest(arr);
        int ans2 = secondLargestBetter(arr);
        System.out.println(ans2);
    }

    private static int secondLargestBetter(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for (int i = arr.length-2; i >0 ; i--) {
            if(arr[i]<largest){
                largest = arr[i];
            }
            return largest;
        }
        return -1;
    }



    private static int secondLargest(int[] arr) {
        int firstLargest = 0;
        int secLargest = Integer.MIN_VALUE;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                secLargest = firstLargest;
                firstLargest = max;
            }
        }

        if(arr.length == 2 && arr[0]==arr[1] || (arr.length <= 1)){
            return Integer.MIN_VALUE;
        }
        else {
            return secLargest;
        }


    }
}
