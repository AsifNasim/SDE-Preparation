import java.util.Scanner;

public class Ques_9_MidZeroPattern {
    /*Pattern
       1
       2 2
       3 0 3
       4 0 0 4
       5 0 0 0 5
       */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int row = 1;
        while (row <= input){
            int col = 1;
            while (col <= row){
                if(col > 1 && col<row ){
                    System.out.print("0"+" ");
                }
                else {
                    System.out.print(row+" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
