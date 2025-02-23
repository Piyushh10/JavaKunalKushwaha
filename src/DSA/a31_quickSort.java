package DSA;

import java.util.Arrays;

public class a31_quickSort {
    public static void main(String[] args) {
        int [] arr = {100, 101, 169, 201, 2, 6, 8, 9, 10};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        a32_linkedlist list = new a32_linkedlist();
        list.insertAtFirst(1);
        list.insertAtFirst(6);
        list.insertAtFirst(12);
        list.insertAtEnd(999);
        list.insertAtFirst(18);
        list.insert(69, 2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

    }
    static void sort(int [] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while(s <= e){
            //if it is already sorted, it won't enter the loop & will save time
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if ( s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //now pivot is at correct index, sort 2 halves
        sort(nums, low, e);
        sort(nums, s, high);
    }
}

