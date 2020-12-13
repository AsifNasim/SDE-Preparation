import java.util.Scanner;

public class Ques_8_CheckArrayRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int ans = CheckArrayRotation(arr);
        System.out.println(ans);

    }

    private static int CheckArrayRotation(int[] arr) {
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
