import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques_6_UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int [] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }

        int size2 = s.nextInt();
        int [] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        
//        int uniqueElements =
                unionOfTwoArrays(arr1, arr2);
//        System.out.println(uniqueElements);
    }

    private static void unionOfTwoArrays(int[] arr1, int[] arr2) {
        Map<Integer, Integer> union = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            union.put(arr1[i],i);
        }

        for (int j   = 0; j <arr2.length ; j++) {
            union.put(arr2[j],j);
        }

        System.out.println(union);
//        int ans = union.size();
//
//        return ans;
    }
}
