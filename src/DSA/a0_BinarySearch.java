package DSA;
public class a0_BinarySearch {
    static int binarySearch(int [] arr, int target){
        // First step is to find the middle element
//        target>mid => search in the right else search in the left
//        if middle element==target then we have got our answer
//        Best case scenario is O(1) when the element is exactly the middle one
//        Total comparisons in the worst case = log(N) and the complexity is O(logN)
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
// we cannot do (start+end)/2 as it might exceed the integer value limit
            if(target<arr[mid]){
                end = mid - 1;

            } else if(target>arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    //    order agnostic binary search
    static int orderAgnosticBinarySearch(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
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

    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans = orderAgnosticBinarySearch(arr, 89);
        System.out.println(ans);
    }
}
