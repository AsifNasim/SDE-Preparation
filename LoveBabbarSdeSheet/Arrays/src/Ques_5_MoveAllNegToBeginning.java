import java.util.Scanner;

public class Ques_5_MoveAllNegToBeginning {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        moveAllNegToBeginning(arr);
        display(arr);
    }

    private static void moveAllNegToBeginning(int[] arr) {
        int curr = 0;
        int pos = arr.length-1;
        while (curr <= pos){
            if(arr[curr] > 0){
                swapElem(arr, curr, pos);
                curr++;
                pos--;
            }
            else{
                curr++;
            }
        }
    }

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
