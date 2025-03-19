package DSA;


import java.util.Scanner;

//its  a simple binary tree, not BST
public class a37_binarytrees {

    public a37_binarytrees() {

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the root node value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of "+node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of "+node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }



    }

}



/*

 */












/*
Prerequisites-
For trees, you need to learn recursion first
OOPs should also be clear

------------------------------------------------------------

In Binary trees every node has 0/1/2 kids-
it can either be null or any value

------------------------------------------------------------

Reasons of using binary tree-
1. You can insert, remove, find items in O(log n) time.
2. Efficiently performing operations.
3. Items are stored in a order, on the left you'll find smaller
numbers and on the right you'll find larger numbers which makes
the data more organized. (BST)
4. It is cost efficient.

------------------------------------------------------------

Unbalanced tree makes the complexity worse [O(n)].

How to make sure tree remains balanced throughout?
Answer- Self balancing binary trees like AVL, etc.

Binary trees are inefficient for sorted data.

------------------------------------------------------------

Where is binary tree used?
1. File systems
2. Databases
3. Algorithms/Networking
4. Mathematics
5. Decision Trees in ML
6. Compression of files
7. Future Data Structures also use binary trees

 */