package DSA;

import java.util.LinkedList;

public class a32_linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public a32_linkedlist(){
        this.size = 0;
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}


// Check a31_quickSort.java for linkedlist implementation
