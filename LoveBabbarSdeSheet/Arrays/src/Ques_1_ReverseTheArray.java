import java.util.Scanner;

public class Ques_1_ReverseTheArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        reverseArray(arr);
        display(arr);
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swapElem(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swapElem(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
