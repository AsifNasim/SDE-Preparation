import java.util.Scanner;

public class Ques_4 {
/*start pattern*/
/*    * * *   * * *
 * *       * *
 *           *
 * *       * *
 * * *   * * *
 */
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();
    int k = 1;
    int row = 1;
    while (k <= input){

        int col1 = 1;
        while (col1 <= input - (row +1)){
            System.out.print("*"+" ");
            col1++;
        }

        int space = 1;
        while (space <= 2*row -1){
            System.out.print(" "+" ");
            space++;
        }

        int col2 = 1;
        while (col2 <= input - (row + 1)){
            System.out.print("*"+" ");
            col2++;
        }

        if (k >= input/2 +1){
            row = row -1;
        }
        else {
            row = row + 1;
        }

        System.out.println();
        k++;
    }
}
}
