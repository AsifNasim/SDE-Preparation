import java.util.Scanner;

public class binarySearch {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int elem = s.nextInt();
        System.out.println(binarysearch(arr, elem));
    }

     static int binarysearch(int[] arr, int elem) {
         int start = 0;
         int end = arr.length-1;

         while ( start <= end){
            // int mid = (start + end)/2; // not an efficient way of calculating mid as the range of int exceed
             int mid = start + (end - start)/2;
             if (elem == arr[mid]){
                 return mid;
             }

             else if(elem > arr[mid]){
                 start = mid+1;
             }
             else{
                 end = mid -1;
             }
         }
         return -1;
    }
}
