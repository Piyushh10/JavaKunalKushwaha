package DSA;
public class a11_2DarrayBS {

    // Brute force approach
    static int findTarget(int [][]arr, int target){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3}, {4,5,10}
        };
        int target = 10;
        System.out.println(findTarget(arr, target));
    }
}


