import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/shuffle-the-array/submissions/

public class ArrayShuffle {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[2*size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        
        int [] ans = shuffleArray(arr, size);
        System.out.println(Arrays.toString(ans));
    }


    static int[] shuffleArray(int[] arr, int n) {
        int [] newArr = new int[2*n];

        int pointerOne = 0;
        int pointerTwo = n;
        int i = 0;
        while (pointerOne < n){
            newArr[i] = arr[pointerOne];
            newArr[i+1] = arr[pointerTwo];
            pointerOne++;
            pointerTwo++;
            i+=2;
        }

        return newArr;
    }

//     static int[] shuffleArray(int[] arr, int n) {
//        int [] newArr = new int[2*n];
//         for (int i = 0; i < newArr.length ; i++) {
//             newArr[i] = arr[i];
//             newArr[i+1] = arr[n+i];
//         }
//
//         return newArr;
//    }
}
