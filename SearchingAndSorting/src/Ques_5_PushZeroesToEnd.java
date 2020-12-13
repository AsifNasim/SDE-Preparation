import java.util.Scanner;
//  i/p 2 0 2 0 2 1
//  o/p 2 2 2 1 0 0
public class Ques_5_PushZeroesToEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        PushToEnd(arr);
        display(arr);
    }

    private static void PushToEnd(int[] arr) {
        int nonZero = 0;
        int zero = 0;
        while (zero < arr.length){
            if(arr[zero] != 0){
                swapElem(arr, zero, nonZero);
                nonZero++;
            }
            zero++;
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
