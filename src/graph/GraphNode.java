package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private String name;
    private int index;
    private List<GraphNode> neighbour = new ArrayList<>();


    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return this.index;
    }

    public List<GraphNode> getNeighbour() {
        return this.neighbour;
    }
}
