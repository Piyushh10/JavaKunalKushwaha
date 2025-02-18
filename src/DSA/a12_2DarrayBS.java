package DSA;

import java.util.Arrays;

public class a12_2DarrayBS {
    /*

A matrix is sorted in a row wise and column wise manner
10 20 30 40                       let the target be 37
15 25 35 45
28 29 37 49
33 34 38 50

case 1 : if element ==  target, answer found
case 2 : if element < target, row++;
case 3 : if element > target, column--;

In the above example, 10 will be the lower bound and 40 will the upper bound
In the first row we can see that 37 < 40, so it basically means that the target
will definitely not be in the last column, so we will do column--; and check
whether the target is less than or greater than 30, after checking we can see the
values on the left of 30 will be less than it and as 30 is not our target, we can
ignore the values on the left as they will also be less than the target, so we will
do row++; now we will go to 35, as it is less than target, again we will do row++;
now move to 37, as it is equal to the target, we will end our search.

time complexity= O(n)
 */
    static int[] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;
        while(r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            } else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
        System.out.println(Arrays.toString(search(arr, 69)));

    }
}
/*
 4  3  2  -1
 3  2  1  -1
 1  1 -1  -2
-1 -1 -2  -3
 */