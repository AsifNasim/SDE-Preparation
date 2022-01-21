import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
public class findEvenNums1295 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }

        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] nums){
        int evenNums = 0;

        for(int i = 0; i < nums.length; i++){

//            take the element at every index count its digit and checks
//            if the count is even or not
            int isEven = nums[i];
            int count = 0;

            while(isEven > 0){

                count++;
                isEven /=10;
            }
            if(count%2 == 0){
                evenNums++;
            }
        }

        return evenNums;
    }

//    count number of 
}
