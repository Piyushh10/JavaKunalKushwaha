package DSA;

public class a7_duplicateValuesRotatedArrayBS {
    //copy and paste with a little modification at the end
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
            // If elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid]==arr[end]){
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start ++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end;
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
        return -1;
    }
    public static void main(String[] args) {

    }
}
