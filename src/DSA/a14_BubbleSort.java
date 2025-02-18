package DSA;

import java.util.Arrays;

public class a14_BubbleSort {
    public static void main(String[] args) {
        int []arr = {69,67,1,3,4,5,2,7,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;

//            for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
//                swap if the item is smaller thant the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if you did not swap for a particular value of i, it means the array is
//            sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
// best case time complexity = O(n)
// worst case time complexity = O(n^2)
