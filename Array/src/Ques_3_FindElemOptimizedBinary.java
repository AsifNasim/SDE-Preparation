import java.util.Scanner;

public class Ques_3_FindElemOptimizedBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int elem = s.nextInt();
        int ans = maxFoundAtIndexOptimized(arr, elem);
        System.out.println(ans);
    }

    private static int maxFoundAtIndexOptimized(int[] arr, int elem) {
        int start = 0;
        int end = arr.length -1;
        while ( start <= end ){
            int mid = (start+end)/2;
            if(arr[mid] == elem){
                return mid;
            }
            else if( arr[mid] < elem){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return  -1;
    }
}
