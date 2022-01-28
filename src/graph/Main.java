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
        Graph graph = new Graph(nodeList);
        graph.addUndirectedEdgeToMatrix(0, 1);
        graph.addUndirectedEdgeToMatrix(0, 2);
        graph.addUndirectedEdgeToMatrix(0, 3);
        graph.addUndirectedEdgeToMatrix(1, 4);
        graph.addUndirectedEdgeToMatrix(2, 3);
        graph.addUndirectedEdgeToMatrix(3, 4);

        System.out.println(graph.printAdjacencyMatrix());


        graph.addUndirectedEdgeToList(0, 1);
        graph.addUndirectedEdgeToList(0, 2);
        graph.addUndirectedEdgeToList(0, 3);
        graph.addUndirectedEdgeToList(1, 4);
        graph.addUndirectedEdgeToList(2, 3);
        graph.addUndirectedEdgeToList(3, 4);

        System.out.println(" ---------------  Graph as Adjacency List -----------------");
        System.out.println(graph.printAdjacencyList());

        graph.bfsTraversal();

        resetNodesVisitStatus(nodeList);

        graph.dfsTraversal();
    }

    private static void resetNodesVisitStatus(List<GraphNode> nodeList) {
        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).setVisited(false);
        }
    }
}
