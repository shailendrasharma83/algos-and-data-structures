package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Graph {

    private List<GraphNode> nodeList;
    private int[][] adjacencyMatrix;

    public Graph(List<GraphNode> nodes) {
        this.nodeList = nodes;
        this.adjacencyMatrix = new int[nodes.size()][nodes.size()];
    }

    public void addUndirectedEdgeToMatrix(int i, int j) {
        this.adjacencyMatrix[i][j] = 1;
        this.adjacencyMatrix[j][i] = 1;
    }

    public void addUndirectedEdgeToList(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);

        first.getNeighbour().add(second);
        second.getNeighbour().add(first);
    }

    public void adddirectedEdgeToList(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);

        first.getNeighbour().add(second);
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

    public void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);

            System.out.print(currentNode.getName() + " ");

            for (GraphNode neighbor : getNeighbours(currentNode)) { // currentNode.getNeighbour() when using adjacency list
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.setVisited(true);

            System.out.print(currentNode.getName() + " ");


            for (GraphNode neighbor : getNeighbours(currentNode)) { // currentNode.getNeighbour() when using adjacency list
                if (!neighbor.isVisited()) {
                    stack.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    private List<GraphNode> getNeighbours(GraphNode node) {
        List<GraphNode> neighbours = new ArrayList();
        int index = node.getIndex();

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[index][i] == 1) {
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;

    }

    public void bfsTraversal() {
        System.out.print("BFS Traversal :: ");
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                bfsVisit(node);
            }
        }
    }

    public void dfsTraversal() {
        System.out.print("\nDFS Traversal :: ");
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                dfsVisit(nodeList.get(0));
            }
        }
    }

    private void topologicalVisit(GraphNode node, Stack stack) {

        for (GraphNode neighbour : node.getNeighbour()) {
            if (!neighbour.isVisited()) {
                topologicalVisit(neighbour, stack);
            }
        }

        stack.push(node);
        node.setVisited(true);
    }

    public void topologicaSort() {
        Stack stack = new Stack();
        for (GraphNode node : nodeList) {
            if (!node.isVisited())
                topologicalVisit(node, stack);
        }

        while (!stack.isEmpty()) {
            GraphNode node = (GraphNode) stack.pop();
            System.out.print(node.getName() + " ");
        }
    }
}
