import java.util.Scanner;

public class Ques_7_CyclicallyRotateByOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        cyclicallyRotateByOne(arr);
        display(arr);
    }

    private static void cyclicallyRotateByOne(int[] arr) {
        reverseXor(arr, 0, arr.length-2);
        reverseXor(arr, 0, arr.length-1);

    }

    private static void cyclicallyRotateByOneAlt(int[] arr) {
        System.out.print(arr[arr.length-1]+" ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static void reverseXor(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] = arr[start]^arr[end];
            arr[end] = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
            start++;
            end--;
        }
    }




    public static void display(int [] arr){
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
    }
}
