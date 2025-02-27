package DSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class a36_queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        //Returns head of the queue, if empty then returns null
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove()+"\n");


        //Deque can insert and remove from both first and last
        // it is faster than ll and stack
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(1);
        deque.addLast(99);
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        // there are a lotttt of in-built functions, do check them out
    }
}

/*
FIFO and LILO
Queue is easy too
Insertion happens from the end. Removal happens from the start

Stack is originally a class. Queue is originally an Interface

Binary tree traversal, BFS, DFS - Stack, Queue and deque use cases
 */