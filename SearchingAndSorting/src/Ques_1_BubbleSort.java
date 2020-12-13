import java.util.Scanner;

public class Ques_1_BubbleSort {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        bubbleSort(arr);
        display(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    SwapElem(arr,i,j);
                }

            }
        }
    }

    private static void SwapElem(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
