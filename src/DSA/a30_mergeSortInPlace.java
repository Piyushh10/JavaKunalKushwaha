package DSA;

import java.util.Arrays;

public class a30_mergeSortInPlace {
    public static void main(String[] args) {
        int [] arr = {31,4,6,81,9,10,13,15};
//        System.out.println(Arrays.toString(mergeSInPlace(arr)));
        mergeSInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSInPlace(int [] arr, int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = s + (e-s)/2;
        mergeSInPlace(arr,s, mid);
        mergeSInPlace(arr, mid, e);
        mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int [] arr, int s, int m, int e){
        int [] ans = new int[e-s];

        int i = s, j = m, k = 0;
        while(i < m && j< e){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            } else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        //maybe possible that one of the array is not complete
        // add all the remaining elements
        while(i < m){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(ans, 0, arr, s , ans.length);
    }

}
