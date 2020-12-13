import java.util.Scanner;

public class Ques_6_kRotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        kRotate(arr, k);
        display(arr);
    }

    private static void kRotate(int[] arr, int k) {
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, arr.length-1);
        reverseArr(arr, 0, arr.length-1);

    }

    private static void reverseArr(int[] arr, int start, int end) {
        while (start <= end){
            swapElem(arr, start, end);
            start++;
            end--;
        }
    }
    private static void swapElem(int[] arr, int zero, int nonZero) {
        int temp = arr[zero];
        arr[zero] = arr[nonZero];
        arr[nonZero] = temp;
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
