import java.util.Scanner;

public class Ques_19_StrictlyIncDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int start = 0;
        int end = arr.length-1;
        boolean flag = false;
        while (start < end){
            if( (arr[start] > arr[start+1]) && (arr[end] > arr[end -1])){
                flag = true;
            }
//            else {
//                flag = false;
//            }
            start++;
            end--;
        }
        System.out.println(flag);
    }
}
