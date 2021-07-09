package Graphs;

public class UndirectedGraph {
    // Total number of nodes = V
    private int V ;
    //Total edges = E
    private int E;

    private int[][] adjMatrix;
    
    public UndirectedGraph(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdges(int u , int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        E++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V +" Vertex " + E+" Edges !"+"\n");
        for(int v = 0; v<V ; v++){
            sb.append(v +" : " );
            for(int i : adjMatrix[v]){
                sb.append( i +" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String args[]){
        UndirectedGraph graph = new UndirectedGraph(4);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,0);
        System.out.print(graph);
    }

    
}
