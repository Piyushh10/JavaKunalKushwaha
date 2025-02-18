package DSA;

public class a9_splitArrayLargestSumBS {
    static int splitArray(int [] arr, int a){
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]); //This will contain the max item
            end += arr[i]; //Sum of all the vlaues
        }
        //binary search
        while(start<end){
            //try for the middle as a potential answer
            int mid =  start + (end - start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if(sum+num > mid){
                    //you cannot add this in this sub-array, make a new one
                    //say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }
            if(pieces> a){
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        return end; //here start will be equal to end
    }
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
    }
}
