package DSA;
public class a1_BinarySearchQuestions {
//    apply binary search whenever you see a sorted array
//    Find the Ceiling, ceiling is the smallest number in array greater than or equal to the target element
    /*
    For example-> arr = {2,3,5,9,14,16,18}
     Ceiling(arr, target = 14) = 14
     Ceiling(arr, target = 15) = 16
     Ceiling(arr, target = 4) = 5
     Ceiling(arr, target = 9) = 9
     */
public static void main(String[] args) {
    int [] arr = {2,3,5,9,14,16,18};
    System.out.println(findCeiling(arr,19));
    System.out.println(findFloor(arr,1));
//    int c = findCeiling(arr,15);
//    System.out.println(c);
//    System.out.println(findFloor(arr,15));
//    System.out.println(findCeiling(arr,14));
//    System.out.println(findCeiling(arr,2));
//    System.out.println(findCeiling(arr,18));
//    System.out.println(findCeiling(arr,4));

}
static int findCeiling(int [] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    if(target>arr[arr.length-1]){
        return -1;
    }
    while(start<=end){
        int mid = start + (end - start)/2;
        if(target>arr[mid]){
            start = mid + 1;

        } else if(target<arr[mid]){
            end = mid - 1;
        } else{
            return arr[mid];
        }
    }
    return arr[start];
}
    static int findFloor(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[0]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;

            } else if(target>arr[mid]){
                start = mid + 1;
            } else{
                return arr[mid];
            }

        }
        return arr[end];
    }
}
