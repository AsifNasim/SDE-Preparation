import java.util.Scanner;

public class Ques_4_Sort012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        sort012Better(arr);
        display(arr);

    }

    private static void sort012Better(int[] arr) {
        int curr = 0;
        int zeroPos = 0;
        int twoPos = arr.length-1;

        while (curr <= twoPos){
            if(arr[curr] == 0){
                swapElem(arr, curr, zeroPos);
                curr++;
                zeroPos++;
            }

            else if(arr[curr] == 1){
                curr++;
            }

            else{
                swapElem(arr, curr, twoPos);
                twoPos--;
            }
        }
    }


//      Sasta Approach only correct for small inputs
//    private static void sort012(int[] arr) {
//        for (int i = 0; i < arr.length-3; i++) {
//            if(arr[i] > arr[i+1] && arr[i] > arr[i+2]){
//                swapElem(arr,i,i+2);
//            }
//            if(arr[i] < arr[i+1] && arr[i+1]> arr[i+2]){
//                swapElem(arr,i+1, i+2);
//            }
//
//            if(arr[i] > arr[i+1] && arr[i] > arr[i+2] && arr[i+1]< arr[i+2]){
//                swapElem(arr,i,i+1);
//            }
//            if(arr[i] > arr[i+1] && arr[i+1] < arr[i+2]){
//                swapElem(arr,i, i+1);
//            }
//        }
//    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swapElem(int [] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
