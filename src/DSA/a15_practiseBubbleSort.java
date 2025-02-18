package DSA;

import java.util.Arrays;

public class a15_practiseBubbleSort {
    static void bubbleSort(int [] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
