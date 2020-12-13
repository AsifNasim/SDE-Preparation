import java.util.Scanner;

public class Ques_3_KthSmallestArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int ans = kthSmallestBetter(arr, k);
        System.out.println(ans);
    }
// solution is correct but time limit is exceeding
    private static int kthSmallestinArray(int[] arr, int k) {
        for (int j = 1; j <arr.length ; j++) {
            int key = arr[j];
            int i = j-1;
            while (i >= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }

        return arr[k-1];
    }

    private static int kthSmallestBetter(int [] arr, int k){
        return kthSmallestBetter(arr, 0, arr.length-1,k);
    }

    private static int kthSmallestBetter(int[] arr, int l, int r, int k)
    {
        //Your code here
        int [] sortArr = sortedArray(arr, l,r);

        return sortArr[k-1];


    }


    private static int [] sortedArray(int [] arr, int l, int r){
        if(l == r){
            int [] br = new int[1];
            br[0] = arr[l];
            return br;
        }

        int mid = (l+r)/2;

        int [] first = sortedArray(arr, l, mid);
        int [] second = sortedArray(arr, mid+1, r);

        int [] sortedArray = mergeSort(first, second);

        return sortedArray;

    }


    private static int [] mergeSort(int [] first, int [] second){
        int  [] finalArr = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                finalArr[k] = first[i];
                i++;
                k++;
            }
            else{
                finalArr[k] = second[j];
                j++;
                k++;
            }

            if(i == first.length){
                while(j < second.length){
                    finalArr[k] = second[j];
                    j++;
                    k++;
                }

            }

            if(j == second.length){
                while(i < first.length){
                    finalArr[k] = first[i];
                    i++;
                    k++;
                }
            }
        }
        return finalArr;
    }
}
