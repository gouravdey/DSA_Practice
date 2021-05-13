package main.implementation.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GraphClass {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(1,2);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(6,5);
        graph.printGraph();
        System.out.println();
        graph.removeVertex(0);
        graph.removeVertex(4);
        graph.removeEdge(1,3);
        graph.printGraph();
    }

}

class Graph {

    Map<Integer, LinkedList<Integer>> adjacentLists = new HashMap<>();

    public void addVertex(int node) {
        adjacentLists.put(node, new LinkedList<>());
    }

    public void addEdge(int sourceNode, int destinationNode) {
        adjacentLists.get(sourceNode).add(destinationNode);
        adjacentLists.get(destinationNode).add(sourceNode);
    }

    public void removeVertex(int node) {
        for (LinkedList<Integer> item : adjacentLists.values()) {
            item.remove(Integer.valueOf(node));
        }
        adjacentLists.remove(node);
    }

    public void removeEdge(int sourceNode, int destinationNode) {
        adjacentLists.get(sourceNode).remove(Integer.valueOf(destinationNode));
        adjacentLists.get(destinationNode).remove(Integer.valueOf(sourceNode));
    }

    public void printGraph() {
        for (Integer item:adjacentLists.keySet()) {
            System.out.println(item + " -> " + adjacentLists.get(item));
        }
    }
}