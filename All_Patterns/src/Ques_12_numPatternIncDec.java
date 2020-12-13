import java.util.Scanner;

public class Ques_12_numPatternIncDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int row = 1;
        while (row <= input){
            int col1 = 1;
            while (col1 <= row){
                if (row == input && col1 == input){
                    break;
                }
                System.out.print(col1+" ");
                col1++;
            }
            int space = 1;
            while (space <= 2 * (input-row) -1){
                if (row == input){
                    break;
                }
                System.out.print(" "+" ");
                space++;
            }

            int col2 = row;
            while (col2 >=1){
                System.out.print(col2+" ");
                col2--;
            }
            System.out.println();
            row = row+1;
        }
    }
}
