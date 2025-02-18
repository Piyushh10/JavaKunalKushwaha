package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a21_cyclicSortPractise {
    static List<Integer> numbersFinder(int []arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if( arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        List <Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int []arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = numbersFinder(arr);
        System.out.println(ans);
    }
}
