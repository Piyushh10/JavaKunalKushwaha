package DSA;
/*
search for the element in an infinite array
 */
public class a4_BinarySearchInfiniteArray {
    static int findingRange(int []arr, int target){
//        Find the range first, first start with a box of size 2
        int start = 0;
        int end = 1;

//        condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end + 1;
            end = end + 2*(end-start +1);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int []arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start )/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {2,3,5,6,7,8,10,11,12,15,20,23,30,32,48,50};
        System.out.println(findingRange(arr,23));
    }
}
