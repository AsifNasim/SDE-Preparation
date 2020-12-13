import java.util.Scanner;

public class Ques_4_ArrayReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        reverseArrayRecursive(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    private static void reverseArrayRecursive(int[] arr){
        reverseArrayRecursive(arr, 0 , arr.length-1);

    }

    private static void reverseArrayRecursive(int[] arr, int start, int end) {
        if(start == end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayRecursive(arr, start+1, end-1);
    }
}
