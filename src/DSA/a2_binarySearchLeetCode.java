package DSA;

public class a2_binarySearchLeetCode {
    /* 744.
    Given a characters array that is sorted in non-decreasing order and a character target,
    return the smallest character in the array that is larger than target
     */
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        System.out.println(findCeiling(letters,'j'));
    }
    static char findCeiling(char [] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return arr[start  % arr.length];
    }
}
