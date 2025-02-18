package DSA;

import java.util.Arrays;

public class a17_practiseSeletionSort {
    static void selection(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }
    static int getMaxIndex(int []arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int []arr, int pehla, int dusra){
        int temp = arr[pehla];
        arr[pehla] = arr[dusra];
        arr[dusra] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,3,9,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
