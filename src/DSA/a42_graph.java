package DSA;

import java.util.ArrayList;

public class a42_graph {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int adj[][] = new int [n+1][n+1];

        //edge 1----2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2----3
        adj[2][3] = 1;
        adj[3][2] = 1;

        //edge 1----3
        adj[1][3] = 1;
        adj[3][1] = 1;

        ArrayList<ArrayList<Integer>> adj_new = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <=n; i++) {
            adj_new.add(new ArrayList<Integer>());
        }

        adj_new.get(1).add(2);
        adj_new.get(2).add(1);

        adj_new.get(2).add(3);
        adj_new.get(3).add(2);

        adj_new.get(1).add(3);
        adj_new.get(3).add(1);

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < adj_new.get(i).size(); j++) {
                System.out.print(adj_new.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

/*
INPUT RECEIVED FOR AN UNDIRECTED GRAPH-
N -> nodes
M -> edges

example=>
1 2
1 3
3 4
2 4
2 5
4 5
(basically you have to write the connecting pairs)


HOW TO STORE THIS?
1. Using adjacency matrix
           OR
2. Using adjacency list

a unit based indexing-> when nodes are from 1-5 and N=5
So in a unit based graph, you have to define an adj[n+1][n+1]

now draw a grid of size n x n and place 1 for each relation bw nodes
and place 0 for the rest of the blocks

example is there in the main class

using array will make it very inefficient for space, so we will be using
arraylist inside an arraylist to increase efficiency


 */
