import java.util.Scanner;

public class AgnosticBinarySearch {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        System.out.println(agnosticBinSearch(arr, target));
    }

     static int agnosticBinSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end ){
            int mid = start + (end - start)/2;
//            If the sorted array is in Ascending Order
            if (isAsc){
                if(target == arr[mid]){
                    return mid;
                }
                else if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else{
//                If the sorted array is in Descending Order
                if(target == arr[mid]){
                    return mid;
                }
                else if(target < arr[mid]){
                     start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
