package DSA;

public class a33_DLL {
    private Node head;

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertAtEnd(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val){
        Node p = find(after);

        if(p == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
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

//    public int deleteFirst(){
//        int val = head.value;
//        head = head.next;
//        if(head == null){
//            tail = null;
//        }
//        size--;
//        return val;
//    }
//
//    public int deleteLast(){
//        if(size <= 1){
//            return deleteFirst();
//        }
//        Node secondLast = get(size - 2);
//        int val = tail.value;
//        tail = secondLast;
//        tail.next = null;
//        return val;
//    }
//
//    public int delete(int index){
//        if(index == 0){
//            return deleteFirst();
//        }
//        if(index == size-1){
//            return deleteLast();
//        }
//
//        Node previ = get(index-1);
//        int val = previ.next.value;
//        previ.next = previ.next.next;
//        return val;
//
//    }
//
//    public Node get(int index){
//        Node node = head;
//        for (int i = 0; i < index; i++) {
//            node = node.next;
//        }
//        return node;
//    }

//    public void display(){
//        Node temp = head;
//        Node last = null;
//        while(temp != null){
//            System.out.print(temp.value + " -> ");
//            last = temp;
//            temp = temp.next;
//        }
//        System.out.println("END");
//
//        //reverse display
//        while(last != null){
//            System.out.print(last.value + "->");
//            last = last.prev;
//        }
//        System.out.println("START");
//    }

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