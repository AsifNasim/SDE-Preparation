import java.util.Scanner;

public class Ques_1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int row = 1;
        int val = 0;
        while (row <= n) {
            int space = 1;
            while (space <= n - row) {
                System.out.print(" ");
                space += 1;
            }
            int col = 1;
            while (col <= (2 * row) - 1) {
                if (col <= row) {
                    ++val;
                    System.out.print(val);

                } else {
                    val--;
                    System.out.print(val);
                }
                col = col + 1;
            }
            System.out.println();
            row += 1;
            val = row - 1;

        }
    }
}


