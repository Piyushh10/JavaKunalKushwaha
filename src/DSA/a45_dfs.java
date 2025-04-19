package DSA;

import java.util.ArrayList;

public class a45_dfs {
    public static void dfs(int node, boolean vis[],
                           ArrayList<ArrayList<Integer>> adj,
                           ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);

        for(Integer it : adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, adj, ls);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>>adj){
        boolean vis[] = new boolean[v+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }
}

