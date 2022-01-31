package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedNode implements Comparable<WeightedNode> {

    public String name;
    public int index;
    public WeightedNode parent;
    public int distance;
    public List<WeightedNode> neighbours;
    public Map<WeightedNode, Integer> weightMap;

    public WeightedNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
        neighbours = new ArrayList<>();
        weightMap = new HashMap<>();
    }

    public int compareTo(WeightedNode obj) {
        return this.distance - obj.distance;
    }
}
