import java.util.Scanner;

public class Ques_2_SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        selectionSort(arr);
        display(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int counter = 0; counter <arr.length ; counter++) {
            int min = counter;
            for (int j = min+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min =  j;
                }
                if(min != counter){
                    SwapElem(arr, min, counter);
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


