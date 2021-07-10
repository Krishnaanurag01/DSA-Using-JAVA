package Graphs;
import java.util.*;

public class GraphUsingAdjLIST {
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


    public static void main(String[] args) {
        GraphUsingAdjLIST graph = new GraphUsingAdjLIST(4);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,0);
        System.out.print(graph);
        
    }
    
}
