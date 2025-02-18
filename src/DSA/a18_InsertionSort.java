package DSA;

import java.util.Arrays;

/*
5  3  4  1  2 -array
0  1  2  3  4 - index

The idea is to first sort till index 0, then till index 1, then till index 2, then 3
and so on........

For every index: put that index element at the correct index of LHS.

After First pass(i=0) 3 5 4 1 2  --> sort array till index 1
After Second pass(i=1) 3 4 5 1 2  --> sort array till index 2
After third pass(i=2) 1 3 4 5 2  --> sort array till index 3
After fourth pass(i=3) 1 2 3 4 5  --> sort array till index 4

It means that i will run fromm 0 to n-2

Worst case time complexity = O(N^2)
Best case time complexity = O(N)

Why use it?
1. Steps get reduced if array is sorted, number of swaps reduced as compared to bubble
sort.
2. Stable sorting.
3. It is used for smaller values of N => works good when array is partially sorted, this
is the reason why it takes part in hybrid sorting algorithms.
 */
public class a18_InsertionSort {
    static void insertionSort(int []arr){
        for (int i = 0; i <=arr.length - 2 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }
    static void swap(int []arr, int pehla, int dusra){
        int temp = arr[pehla];
        arr[pehla] = arr[dusra];
        arr[dusra] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,3,9,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
