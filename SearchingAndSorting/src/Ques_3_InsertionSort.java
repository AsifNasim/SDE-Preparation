import java.util.Scanner;

public class Ques_3_InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        insertionSort(arr);
        display(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int j = 1; j <arr.length ; j++) {
            int key = arr[j]; // taking out the number for comparing
            int i = j-1;
            while ( i >= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key; // putting the key at the minimum space

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

