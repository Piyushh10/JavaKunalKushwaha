package DSA;

/*
Let's say there a collection of items and from it we have to find the
smallest item in constant time. so for that heap is used.
But for adding the items in heap it takes O(log n) time.

It is stored in array but visualised as a graph.
It is represented as a complete binary tree.
Every node value >= all of its children.
root => i
parent => i/2
left => 2i
right => 2i + 1
height => log n

 */

import java.util.ArrayList;

public class a41_heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public a41_heap(){
        list = new ArrayList<>();
    }

    private void swap(int f, int s){
        T temp = list.get(f);
        list.set(f, list.get(s));
        list.set(s, temp);
    }

    private int parent(int index){
        return ((index - 1)/2);
    }

    private int left(int index){
        return (2*index + 1);
    }

    private int right(int index){
        return (2*index+2);
    }

    private void insert(T value){
        list.add(value);
        upheap(list.size() -1);
    }

    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }
    }

    private T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("You are trying to remove from" +
                    "an empty heap!");
        }
        T temp = list.getFirst();
        T last = list.removeLast();
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = right;
        }

        if(min != index){
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

    public void heapUnsortedArray(int n){
        for (int i = n/2; i>=1; i--){
            downheap(i);
        }
    }
}
