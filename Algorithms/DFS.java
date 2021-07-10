package Algorithms;
import java.util.*;

public class DFS {
    public static void main(String[] args) {
        GraphUsingAdjLIST graph = new GraphUsingAdjLIST(5);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,0);
        graph.addEdges(2,4);

        // System.out.print(graph);
        graph.dfsImplementation(0);
        
    }
    
}
class GraphUsingAdjLIST {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj ;

    public GraphUsingAdjLIST(int nodes){
        this.V= nodes;
        this.E=0;
        this.adj = new LinkedList[nodes];
        for(int i =0 ; i<nodes; i++){
            this.adj[i]= new LinkedList<Integer>();
        }
    }

    public void addEdges(int v , int u ){
        this.adj[v].add(u);
        this.adj[u].add(v);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V +" Vertex , "+E+" Edges ! "+"\n");
        for(int i =0 ; i<V ; i++){
            sb.append(i+" : ");
            for(Integer j : adj[i]){
                sb.append(j+" ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public void dfsImplementation(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(!stack.isEmpty()){
            int data = stack.pop();
            if(!visited[data]){
                visited[data] =true;
                System.out.print(data+" ");
                for(int i : adj[data]){
                    if(!visited[i]){
                        stack.push(i);
                    }
                }
            }
        }
    }
}