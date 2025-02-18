package DSA;

import java.util.ArrayDeque;
import java.util.Arrays;

public class a13_2DarrayBS {
    /*
   Search in a sorted matrix:
    1  2  3  4          let target = 3
    5  6  7  8
    9  10 11 12
    13 14 15 16

We will first look at the middle column and perform binary search on it.
As the target is less than 6, it means that all the other elements expect
1,2,3,4,5 will be ignored, so we will exclude the last 2 rows.

case 1 : if element == target, we have found our answer
case 2 : if element > target, ignore rows below it
case 3 : if element < target, ignore rows above it

Here, the upper bound will be firstRow and the lower bound will be lastRow

In the end only 2 rows will be remaining :
 1  2  3  4
 5  6  7  8

 As we will be at the middle column currently, check if it contains the target element
 since none of the 2 and 6 are target element, Now consider the four parts-
  1      |     5     |     3,4     |      7,8

check these parts one by one and now in the third part we will find our target element 3

time complexity= O(log n + log m)
     */

    static int[] simpleBS(int [][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            } else if(matrix[row][mid] > target){
                cEnd = mid - 1;
            } else{
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int [][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length; // be cautions, matrix may be empty
        if(rows == 1){
            return simpleBS(matrix, 0, 0, columns-1, target);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns/2;
        while(rStart < rEnd-1){
// while this is true, it will have more than 2 rows
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[] { mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            } else{
                rEnd = mid;
            }
        }
//        now we have 2 rows
//        check whether the target is in the column of 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

//        search in the first half
        if(target <= matrix[rStart][cMid - 1]){
            return simpleBS(matrix, rStart, 0, cMid-1, target);
        }
        //        search in the second half
        if(target <= matrix[rStart][cMid + 1] && target <= matrix[rStart][columns - 1]){
            return simpleBS(matrix, rStart, cMid+1, columns-1, target);
        }
        //        search in the third half
        if(target <= matrix[rStart + 1][cMid - 1] ){
            return simpleBS(matrix, rStart + 1, 0, cMid-1, target);
        }
        //        search in the fourth half
        else{
            return simpleBS(matrix, rStart + 1, cMid+1, columns-1, target);
        }
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(arr.length);
        System.out.println(Arrays.toString(search(arr, 3)));
        System.out.println(Arrays.toString(search(arr, 63)));

    }
}
//  https://leetcode.com/problems/find-a-peak-element-ii/
