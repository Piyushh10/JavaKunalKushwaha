package DSA;

import java.util.Arrays;

/*
Given an array of integers sorted in ascending order, find te starting and ending
position of a given target value
 */
public class a3_binarySearchLeetCode {
    static int[] findAns(int [] arr, int target){
        int [] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if(ans[0] != -1){
            ans[1] = search(arr, target, false);
        }
        return ans;
    }
    // Return index value of target
    static int search(int [] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else if(target>arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(findAns(arr, 5)));
        System.out.println(Arrays.toString(findAns(arr, 7)));
        System.out.println(Arrays.toString(findAns(arr, 8)));
        System.out.println(Arrays.toString(findAns(arr, 10)));
        System.out.println(Arrays.toString(findAns(arr, 69)));


    }
}
