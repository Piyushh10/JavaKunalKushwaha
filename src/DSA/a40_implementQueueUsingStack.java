package DSA;

import java.util.Stack;

public class a40_implementQueueUsingStack {

}

//insert efficient
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

}