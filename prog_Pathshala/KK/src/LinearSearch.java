import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int elem = s.nextInt();

        System.out.println(linearSearch(arr,elem));
    }

    static int linearSearch(int[] arr, int target) {

        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }

    static int linearSearch2(int[] arr, int target) {

        if(arr.length == 0){
            return -1;
        }

        for (int elem: arr) {
            if (elem == target){
                return elem;
            }
        }
//      not returning -1 cause it could be the value present in the array
        return Integer.MAX_VALUE;
    }


}
