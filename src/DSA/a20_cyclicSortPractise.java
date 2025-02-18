package DSA;
// Amazon asked question
public class a20_cyclicSortPractise {
    static int missingNumber(int[]arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        // search for first missing number
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int []arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {4,0,2,1};
        /*
        after sorting :-
        0  1  2  4  => values
        0  1  2  3  => index
        As 4 != 3, the function will return the index of 4, that is 3
         */
        System.out.println(missingNumber(arr));
    }
}
