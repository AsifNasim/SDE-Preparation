import java.util.Scanner;

public class Ques_9_Sort_0_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//        sort_0_1(arr);
        sort_0_1Better(arr);
        display(arr);
    }

    private static void sort_0_1Better(int[] arr) {
        int zeroPos = 0;
        int curr = 0;
        while (curr < arr.length){
            if(arr[curr] == 0){
                int temp = arr[curr];
                arr[curr] = arr[zeroPos];
                arr[zeroPos] = temp;
//                swapElem(arr, arr[curr], arr[zeroPos]);
                zeroPos++;
            }
            curr++;
        }
    }

    private static void swapElem(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort_0_1(int[] arr) {
        for (int j = 1; j <arr.length ; j++) {
            int key = arr[j];
            int i = j-1;
            while ( i>= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }

            arr[i+1] = key;
        }
    }



    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
