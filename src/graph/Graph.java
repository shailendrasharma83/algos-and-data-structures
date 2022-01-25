package graph;

import java.util.List;

public class Graph {

    private List<GraphNode> nodeList;
    private int[][] adjacencyMatrix;

    public Graph(List<GraphNode> nodes) {
        this.nodeList = nodes;
        this.adjacencyMatrix = new int[nodes.size()][nodes.size()];
    }

    public void addUndirectedEdgeToMatrix(int i, int j) {
        this.adjacencyMatrix[i][j] = 1;
        this.adjacencyMatrix[j][1] = 1;
    }

    public void addUndirectedEdgeToList(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);

        first.getNeighbour().add(second);
        second.getNeighbour().add(first);
    }

    public String printAdjacencyMatrix() {

        StringBuffer nodesSb = new StringBuffer();
        nodesSb.append(" ");
        for (GraphNode node : nodeList) {
            nodesSb.append(" " + node.getName());
        }
        nodesSb.append("\n");
        for (int i = 0; i < this.adjacencyMatrix.length; i++) {
            nodesSb.append(nodeList.get(i).getName() + " ");
            for (int j = 0; j < this.adjacencyMatrix.length; j++) {
                nodesSb.append(this.adjacencyMatrix[i][j] + " ");
            }
            nodesSb.append("\n");
        }
        return nodesSb.toString();
    }

    public String printAdjacencyList() {
        StringBuffer nodesSb = new StringBuffer();

        for (int i = 0; i < nodeList.size(); i++) {
            nodesSb.append(" " + nodeList.get(i).getName() + "-->");
            for (int j = 0; j < nodeList.get(i).getNeighbour().size(); j++) {
                if (j != 0) {
                    nodesSb.append("-->");
                }
                nodesSb.append(nodeList.get(i).getNeighbour().get(j).getName());
            }
            nodesSb.append("\n");
        }

        return nodesSb.toString();
    }


}
