import java.util.Scanner;

public class Ques_2_ElementAtIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int elem = s.nextInt();
        maxFoundAtIndex(arr, elem);
    }

    private static void maxFoundAtIndex(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elem){
                System.out.println(i);
                break;
            }
        }
    }
}
