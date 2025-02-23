package DSA;

public class a33_DLL {
    private Node head;
//    private Node tail;
//    private int size;

//    public a33_DLL(){
//        this.size = 0;
//    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
//        if(tail == null){
//            tail = head;
//        }
//        size++;
    }

    public void insertAtEnd(int val){
//        if (tail == null){
//            insertAtFirst(val);
//            return;
//        }
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size++;

    }

    public void insert(int val, int index){
        if(index == 0){
            insertAtFirst(val);
            return;
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node previ = get(index-1);
        int val = previ.next.value;
        previ.next = previ.next.next;
        return val;

    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        //reverse display
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}