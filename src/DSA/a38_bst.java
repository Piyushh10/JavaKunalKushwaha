package DSA;

public class a38_bst {
    public static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public a38_bst() {
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of "+node.getValue()+" : ");
        display(node.right, "Right child of "+node.getValue()+" : ");

    }

    public void insert(int value){
        root = insert(value, root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.right), height(node.left))+1;

        return node;
    }

    public void populate(int [] num){
        for(int i : num) {
            this.insert(i);
        }
    }

    public boolean balanced(){
        return balanced(root);

    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.right) && balanced(node.left);
    }
}
