package graph;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        System.out.println(" ---------------  Graph as Adjacency Matrix -----------------");
        Graph graphAsMatrix = new Graph(nodeList);
        graphAsMatrix.addUndirectedEdgeToMatrix(0,1);
        graphAsMatrix.addUndirectedEdgeToMatrix(0,2);
        graphAsMatrix.addUndirectedEdgeToMatrix(0,3);
        graphAsMatrix.addUndirectedEdgeToMatrix(1,4);
        graphAsMatrix.addUndirectedEdgeToMatrix(2,3);
        graphAsMatrix.addUndirectedEdgeToMatrix(3,4);
        System.out.println(graphAsMatrix.printAdjacencyMatrix());


        Graph graphAsList = new Graph(nodeList);
        graphAsMatrix.addUndirectedEdgeToList(0,1);
        graphAsMatrix.addUndirectedEdgeToList(0,2);
        graphAsMatrix.addUndirectedEdgeToList(0,3);
        graphAsMatrix.addUndirectedEdgeToList(1,4);
        graphAsMatrix.addUndirectedEdgeToList(2,3);
        graphAsMatrix.addUndirectedEdgeToList(3,4);

        System.out.println(" ---------------  Graph as Adjacency List -----------------");
        System.out.println(graphAsList.printAdjacencyList());
    }
}
