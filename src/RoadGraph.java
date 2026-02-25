import java.util.*;

public class RoadGraph {
    private Map<String, List<String>> adjList;

    public RoadGraph() {
        adjList = new HashMap<>();
    }

    public void addLocation(String cityName) {
        adjList.putIfAbsent(cityName, new ArrayList<>());
    }

    public void addRoad(String source, String destination) {
        if (adjList.containsKey(source) && adjList.containsKey(destination)) {
            adjList.get(source).add(destination);
            adjList.get(destination).add(source);
            System.out.println("Connected " + source + " and " + destination);
        } else {
            System.out.println("Error: One or both cities do not exist!");
        }
    }

    public void displayGraph() {
        System.out.println("\n--- Road Connections (Graph Adjacency List) ---");
        if (adjList.isEmpty()) {
            System.out.println("No data available.");
            return;
        }
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " connects to: " + entry.getValue());
        }
    }
}