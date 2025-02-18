package DSA;

public class a5_BinarySearchMountainPeak {
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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,1,0};
        System.out.println(mountainPeak(arr));
    }
}
