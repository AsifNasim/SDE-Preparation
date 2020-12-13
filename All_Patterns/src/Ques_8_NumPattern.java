import java.util.Scanner;

public class Ques_8_NumPattern {

    /* Pattern
       1
       2 3
       4 5 6
       7 8 9 10
                  */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int row = 1;
        int val = 1;
        while (row <= input){
            int col = 1;
            while (col <= row){
                System.out.print(val+" ");
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
