import java.util.Scanner;

public class Ques_1_MaxElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int ans = maxElement(arr);
        System.out.println(ans);
    }

    private static int maxElement(int[] arr) {
        int maxElem = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxElem){
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
}
