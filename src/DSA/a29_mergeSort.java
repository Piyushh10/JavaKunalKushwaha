package DSA;

import java.util.Arrays;

public class a29_mergeSort {
    public static void main(String[] args) {
        int [] arr = {31,4,6,81,9,10,13,15};
        System.out.println(Arrays.toString(mergeS(arr)));
    }

    static int [] mergeS(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergeS(Arrays.copyOfRange(arr,0, mid));
        int [] right = mergeS(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int [] left, int [] right){
        int [] ans = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;
        while(i < left.length && j<right.length){
            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            } else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        //maybe possible that one of the array is not complete
        // add all the remaining elements
        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}
