import java.util.Scanner;

public class Ques_2_MaxAndMinOfArray {

    //for returning two values
    static class Pair{
        int min;
        int max;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//                minMaxArray(arr);
//                getMinMax(arr);
//        getMinMaxDivide(arr);
        Pair minMax = getMinMaxBetter(arr);
        System.out.println("min " + minMax.min);
        System.out.println("max " + minMax.max);
    }

//    Returning two values as min and max from the given array using linear approach
    private static Pair getMinMax(int [] arr){
        Pair minmax = new Pair();


//        if there is only one element
        if(arr.length == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
        
//        if more than one element 
        if(arr[0] < arr[1]){
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        else{
            minmax.min = arr[1];
            minmax.max = arr[0];
        }

        for (int i = 2; i <arr.length ; i++) {
            if(arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }
        }
        return minmax;
    }


    //    printing using linear approach
    private static void minMaxArray(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println(min +" "+ max);
    }

//    Using tournament approach that is dividing the array into two parts
private static Pair getMinMaxDivide(int [] arr){
        return getMinMaxDivide(arr, 0 , arr.length-1);
}

    private static Pair getMinMaxDivide(int [] arr, int low, int high){

        Pair minmax = new Pair();
        Pair minMaxLeft = new Pair();
        Pair minMaxRight = new Pair();

//        when there is only one element
        if (low == high){
            minmax.min = arr[low];
            minmax.max = arr[low];
            return minmax;
        }

//        when there are two elements

        if(high == low+1){
            if (arr[low] < arr[high]){
                minmax.min = arr[low];
                minmax.max = arr[high];
            }
            else{
                minmax.min = arr[high];
                minmax.max = arr[low];
            }
            return minmax;
        }

//        if there are more than two elements
        int mid = (low + high)/2;
        minMaxLeft = getMinMaxDivide(arr, low, mid);
        minMaxRight = getMinMaxDivide(arr, mid+1, high);

//        comparing minimums of the two
        if(minMaxLeft.min < minMaxRight.min){
            minmax.min = minMaxLeft.min;
        }
        else{
            minmax.min = minMaxRight.min;
        }

//        comparing maximums of the two
        if(minMaxLeft.max > minMaxRight.max){
            minmax.max = minMaxLeft.max;
        }
        else{
            minmax.max = minMaxRight.max;
        }
        return minmax;
    }


    private static Pair getMinMaxBetter(int [] arr){
        Pair minmax = new Pair();

        int i;
        if(arr.length%2 == 0){
            if(arr[0] < arr[1]){
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            else{
                minmax.min = arr[1];
                minmax.max = arr[0];
            }
            i =2;
        }

        else{
            minmax.min = arr[0];
            minmax.max =arr[0];
            i =1;
        }

        while (i < arr.length){
            if(arr[i] < arr[i+1]){
                if(arr[i] < minmax.min){
                    minmax.min = arr[i];
                }
                if(arr[i+1] > minmax.max){
                    minmax.max = arr[i+1];
                }
            }
            else{
                if(arr[i] > minmax.max){
                    minmax.max = arr[i];
                }
                if(arr[i+1] < minmax.min){
                    minmax.min = arr[i+1];
                }
            }
            i +=2;
        }
        return minmax;
    }
}
