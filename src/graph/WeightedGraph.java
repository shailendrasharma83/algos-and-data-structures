package graph;

import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph {

    public List<WeightedNode> nodeList;

    public WeightedGraph(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addDirectedWeightedEdge(int firstIndex, int secondIndex, int weight) {
        WeightedNode first = nodeList.get(firstIndex);
        WeightedNode second = nodeList.get(secondIndex);

        first.neighbours.add(second);
        first.weightMap.put(second, weight);
    }


    public void dijkstrasSPP(WeightedNode node) {

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();

            for (WeightedNode neighbour : currentNode.neighbours) {
                if (queue.contains(neighbour)) {
                    if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {

                        neighbour.distance = currentNode.distance + currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;

                        //refresh queue
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }

        for(WeightedNode noteToPrint : nodeList) {
            System.out.print("Node :: " + noteToPrint.name + ", distance ::  " + noteToPrint.distance + ", path  :: ");
            printPath(noteToPrint);
            System.out.println();
        }
    }

    private void printPath(WeightedNode noteToPrint) {
        if (noteToPrint.parent != null) {
            printPath(noteToPrint.parent);
        }
        System.out.print(noteToPrint.name + " ");
    }
}
