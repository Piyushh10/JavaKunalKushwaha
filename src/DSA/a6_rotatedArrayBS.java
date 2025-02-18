package DSA;
public class a6_rotatedArrayBS {
    public static void main(String[] args) {
//       1. find the pivot element (basically the biggest element)
//        rotated array format is --> ascending order, pivot, ascending order
        int [] arr = {3,4,5,6,7,0,1,2};
//        as there are 2 sorted sub-arrays, apply binary search on both after finding pivot

    }
    static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
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
    static int rotatedBS(int []arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            //apply normal binary search as it not a rotated array
            return binarySearch(arr, target,0,arr.length-1);
        }
        //if pivot is found, you have 2 asc sorted arrays
        if(arr[pivot]==target){
            return  pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length-1);
    }
}
