package DSA;

public class a8_RotationCountBS {

    //For non duplicate values array
    static int countRotations(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[start]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return 0;
    }

    //for array having duplicate values
    static int countRotations2(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            // If elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid]==arr[end]){
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start+1;
                }
                start ++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end+1;
                }
                end --;
            }
            //left side is sorted so the pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            } else{
                end = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
        System.out.println(countRotations2(arr));
    }
}
