package DSA;

import java.util.Arrays;

/*
3  5  2  1  4
When given numbers range from 1 to n, use Cyclic sort

After Sorting => 1  2  3  4  5
Index=>          0  1  2  3  4

See the pattern, index = value - 1

Steps :-
3  5  2  1  4
First check if 3 is at the correct index, as it is not then directly swap it with the
correct index value. 2  5  3  1  4
Repeat the same process for 2 now. 5  2  3  1  4
Repeat the same process for 5 now. 4  2  3  1  5
Repeat the same process for 4 now. 1  2  3  4  5
As you can see all the values are at their correct index now which means that the
array is sorted under a single loop.

Worst case time complexity = O(N)
Best case time complexity = O(N)

 */
public class a19_CyclicSort {
    static void cyclicSort(int [] arr){
        int i = 0;
        while( i <arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }
    static void swap(int []arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
