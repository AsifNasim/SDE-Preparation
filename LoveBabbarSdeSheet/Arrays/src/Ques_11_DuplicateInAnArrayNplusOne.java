import java.util.Arrays;
import java.util.Scanner;

public class Ques_11_DuplicateInAnArrayNplusOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(duplicateInNplusOneAlt(arr));
    }

    private static int duplicateInNplusOne(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }

        return -1;
    }

    private static int duplicateInNplusOneAlt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           int j = Math.abs(arr[i]);
           if(arr[j] < 0){
               return Math.abs(arr[i]);
           }

           arr[j] = -arr[j];
        }

        return -1;
    }
}
