package DSA;

public class a6_BinaryTreeSearchInMountain {
    static int mountainPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
//                you are in decreasing part of the array, this may be the ans, but look
//                at left. This is why end != mid -1
                end = mid;
            } else{
//                you are in ascending part of the array
                start = mid + 1; // because we know that mid+1 element> mid element
            }
        }
//        in the end, start == end and pointing to the largest number
        return start;
    }
    static int orderAgnosticBinarySearch(int []arr, int target, int start, int end){
//        find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;

                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int searchMountain(int [] arr, int target){
        int peak = mountainPeak(arr);
        int firstTry =  orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr, target, peak+1,arr.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,8,6,4,2,0};
        System.out.println(searchMountain(arr, 89));
    }
}
