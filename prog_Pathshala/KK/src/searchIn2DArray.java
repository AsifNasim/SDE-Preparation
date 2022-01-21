import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,44,32},
                {99,55,14,87,43}
        };

        int target = 55;
        System.out.println(Arrays.toString(search2DArr(arr, target)));  // format of return value
        System.out.println(maxValue(arr));
        System.out.println(maxValueforEachLoop(arr));
    }



    static int[] search2DArr(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }

     static int maxValue(int[][] arr) {

        int max = Integer.MAX_VALUE;
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(max > arr[row][col]){
                     max = arr[row][col];
                 }
             }
         }
         return max;
    }

//    using for each loop
    static int maxValueforEachLoop(int[][] arr) {

        int max = Integer.MAX_VALUE;
        for (int [] intArr : arr ) {
            for (int elem: intArr) {
                if(elem < max){
                    max = elem;
                }
            }

        }
        return max;
    }
}
