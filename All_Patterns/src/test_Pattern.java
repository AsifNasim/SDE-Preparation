import java.util.Scanner;

public class test_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
//        starPattern(input);
//        rhTraingePattern(input);
//        incDecPattern(input);
//        isPrime(input);
//        dowPattern(input);
//        arrowPattern(input);
//        pattern_6(input);
//        diamondPattern(input);
//        downDiamondPattern(input);
//        pattern_7(input);
//        pattern_8(input);
//        hourGlass(input);
//        emptyTriangle(input);
//        invertEmptyTriangle(input);
//        hollowSweet(input);
//        pascalTriangle(input);
//        numDiamond(input);
//        hollowHourGlass(input);
//        hourGlassCrown(input);
//        rectHollowBox(input);
//        num_Pattern(input);
//        binaryPattern(input);
//        tiltedHollowBox(input);
//        numIncPattern(input);
    }




    private static void starPattern(int input) {
        int row = 1;
        while (row <= input ){
            int col = 1;
            while (col <= row){
                System.out.print("*"+" ");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    private static void isPrime(int input){
        int d = 2;
        boolean isPrimeNumber = true;
        while ( d*d < input){
            if(input%d == 0){
                isPrimeNumber = false;
            }
            d = d+1;

        }

        if (isPrimeNumber){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }


    }

    private static void rhTraingePattern(int input){
        int row = 1;
        while(row <= input){
            int space = 1;
            while (space <= input-row){
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star <= row){
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
        }
    }

    private static void incDecPattern(int input){
        /*
            1
           232
          34543
         4567654
        567898765
        */
        int val = 1;
        int row = 1;
        while (row <= input){
            int space = 1;
            while (space <= input - row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col <= (2*row -1)){
                if( col >= row ){
                    System.out.print(val);
                    val--;

                }else {
                    System.out.print(val);
                    val++;
                }
                col++;
            }
            System.out.println();
            row = row + 1;
            val = row;
        }
    }

    private static void dowPattern(int input){
        int row = 1;
        while ( row<= input ){
            int col = 1;
            while ( col <= (input - row) +1){
                System.out.print("*");
                col = col + 1;
            }
            row = row +1;
            System.out.println();
        }
    }

    private static void arrowPattern(int input){
        /*
         *
         **
         ***
         ****
         *****
         *****
         ****
         ***
         **
         *
        */
        int k = 1;
        int row = 1;
        while ( k <= input){
            int col = 1;
            while ( col <= row){
                System.out.print("*"+" ");
                col++;
            }

            if ( k >= (input/2) + 1){
                row = row - 1;
            }
            else {
                row = row + 1;
            }
            System.out.println();
            k = k+1;
        }
    }

    private static void pattern_6(int input){
        /*
         *****
          ****
           ***
            **
             *
        */
        int row = 1;
        while ( row <= input){
            int space = 1;
            while (space <= row - 1){
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while ( star <= (input - row) + 1){
                System.out.print("*");
                star++;
            }
            System.out.println();
            row = row + 1;
        }
    }

    private static void diamondPattern(int input){
        /*
                   *
                 * * *
               * * * * *
             * * * * * * *
           * * * * * * * * *
         */
        int row = 1;
        while ( row <= input){
            int space = 1;
            while ( space <= input - row){
                System.out.print(" "+" ");
                space++;
            }

            int col = 1;
            while ( col <= (2*row) -1){
                System.out.print("*"+" ");
                col++;
            }

            System.out.println();
            row++;
        }
    }

    private static void downDiamondPattern(int input){
        /*
             * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *
         */
        int row = 1;
        int k = input;
        while ( row <= input){
            int space = 1;
            while ( space <= row -1){
                System.out.print(" "+" ");
                space++;
            }

            int col = 1;
            while ( col <= 2*k -1){
                System.out.print("*"+" ");
                col++;
            }

            System.out.println();
            row++;
            k--;
        }
    }

    private static void pattern_7(int input){
        /*
              *
             * *
            * * *
           * * * *
          * * * * *
         */
        int row = 1;
        while ( row <= input){
            int space = 1;
            while ( space <= input-row){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= row ){
                System.out.print("*"+" ");
                col++;
            }

            System.out.println();
            row++;
        }
    }

    private static void pattern_8(int input){
        /*
             * * * * *
              * * * *
               * * *
                * *
                 *
         */
        int row = 1;
        while ( row <= input ){
            int space = 1;
            while( space <= row -1 ){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= (input-row) + 1){
                System.out.print("*"+" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    private static void hourGlass(int input){
        /*
        * * * * *
         * * * *
          * * *
           * *
            *
           * *
          * * *
         * * * *
        * * * * *

         */
        int j = (2*input - 1);
        int k = 1;
        int row = 1;
        while ( k <= j){
            int space = 1;
            while ( space <= row -1){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= input - row + 1){
                System.out.print("*"+" ");
                col++;
            }
            if( k >= j/2 + 1){
                row--;
            }
            else{
                row++;
            }
            System.out.println();
            k++;
        }
    }

    private static void emptyTriangle(int input){
        /*
            *
           * *
          *   *
         *     *
        *********
        */
        int row = 1;
        while ( row <= input){
            int space = 1;
            while ( space <= input - row){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= (2*row) - 1){
                if( col == 1 || col == (2*row) - 1 ){
                    System.out.print("*");
                }
                else if(row == input){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }

    private static void invertEmptyTriangle(int input){

        /*
         *********
          *     *
           *   *
            * *
             *
        */
        int row = 1;
        while ( row <=  input){
            int space = 1;
            while ( space <= row -1){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= 2*(input-row) + 1){
                if ( row == 1){
                    System.out.print("*");
                }
                else if( col == 1 || col == 2*(input-row)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;

        }
    }

    private static void hollowSweet(int input){
        /*
          *
         * *
        *   *
       *     *
      *       *
       *     *
        *   *
         * *
          *
         */
        int k = 1;
        int row = 1;
        while ( k <= (2*input) - 1){
            int space = 1;
            while ( space <= input - row){
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while ( star <= (2*row) - 1){
                if ( star == 1 || star == row){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
                star++;
            }

            if( k >= ((2*input)-1)/2 + 1){
                row = row -1;
            }
            else{
                row = row + 1;
            }
            System.out.println();
            k++;
        }
    }

    private static void pascalTriangle(int input){
        /*
                 1
                1 1
               1 2 1
              1 3 3 1
             1 4 6 4 1
         */
        int row = 0;
        while (row < input){
            int space = 1;
            while ( space < (input-row)+ 1){
                System.out.print(" ");
                space++;
            }

            int col = 0;
            while ( col <= row){
                int num = factorial(row);
                int deno = factorial(row - col) * factorial(col);
                System.out.print(num/deno+" ");
                col++;
            }
            System.out.println();
            row++;
        }

    }

    private static int factorial(int num){
        int i = 1;
        int fact = 1;
        while (i <= num){
            fact = fact*i;
            i++;
        }
        return fact;
    }

    private static void numDiamond(int input){

        /*
              1
             212
            32123
           4321234
          543212345
        */

        int val = 1;
        int row = 1;
        while ( row <= input){
            int space = 1;
            while ( space <= input - row){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= (2*row) - 1){
                if ( col >= row ){

                    System.out.print(val);
                    val++;
                }
                else{
                    System.out.print(val);
                    val--;

                }
                col++;
            }

            row++;
            val = row;
            System.out.println();
        }
    }

    private static void hollowHourGlass(int input){
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
        */
        int k = 1;
        int row = 1;
        while ( k <= input){
            int col = 1;
            while ( col <= input ){
              if(row > 1){
                  if ( (col > (input/2) - (row - 1)) && (col < (input/2+1) + (row - 1)) ){
                      System.out.print(" ");
                  }
                  else{
                      System.out.print("*");
                  }
              }
              else if( row == 1){
                  System.out.print("*");
              }

                col++;
            }

            if( k > input/2){
                row = row - 1;
            }
            else if (k == input/2){
                row = row;
            }
            else{
                row = row + 1;
            }

            System.out.println();
            k = k + 1;
        }
    }

    private static void hourGlassCrown(int input){
        /*
         *       *
         **     **
         ***   ***
         **** ****
         *********
         **** ****
         ***   ***
         **     **
         *       *
        */
        int k = 1;
        int row = 1;
        while ( k <= input ){
            int col = 1;
            int colPrint = input+1;
            while ( col < colPrint){
                if ( row == input/2 + 1){
                    System.out.print("*");
                }
                else if( col > row && (col < (input+1) - row)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                col++;
            }

            if ( k >= (input/2 + 1)){
                row = row - 1;
            }
            else{
                row = row + 1;
            }

            System.out.println();
            k++;
        }
    }

    private static void rectHollowBox(int input){

        /*
         ****
         *  *
         *  *
         *  *
         ****

         */
        int row = 1;
        while ( row <= input){
            int col = 1;
            while ( col < input){
                if( row == 1 || row == input){
                    System.out.print("*");
                }
                else if( row > 1 && (col > 1 && col < input-1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

                col++;
            }

            System.out.println();
            row++;
        }
    }

    private static void num_Pattern(int input){
        int val = 1;
        int row = 1;
        while ( row <= input){
            int col = 1;
            while ( col <= row){
                System.out.print(val+" ");
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    private static void binaryPattern(int input){
        /*
            1
            01
            101
            0101
            10101
        */
        int val = 1;
        int row = 1;
        while(  row <= input ){
            int col = 1;
            while ( col <= row){
                System.out.print(val);
                if ( val == 1){
                    val = 0;
                }
                else if( val == 0 ){
                    val = 1;
                }

                col++;
            }
            row++;
            System.out.println();
            if(row%2 == 0){
                val = 0;
            }
            else{
                val = 1;
            }


        }

    }

    private static void tiltedHollowBox(int input){
        int row = 1;
        while ( row <= input ){
            int space = 1;
            while ( space  <= input - row ){
                System.out.print(" ");
                space++;
            }

            int col = 1;
            while ( col <= input ){
                if ( row == 1 || row == input ){
                    System.out.print("*");
                }
                else if( row > 1 && row < input ){
                    if ( col > 1 && col < input ){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }

    private static void numIncPattern(int input){
        int val = 1;
        int row = input;
        while ( row >= 1){
            int col = 1;
            while ( col <= row ){
                System.out.print(val);
                col++;
            }
            System.out.println();
            row--;
            val++;
        }
    }


}
