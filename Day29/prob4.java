/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    // HashMap to store the visited nodes and their respective clones
    private Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // If the node has already been cloned, return the cloned node
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Create a clone for the given node
        // Note: we don't clone the neighbors yet, just initialize an empty list
        Node cloneNode = new Node(node.val, new ArrayList<>());

        // Add it to the hash map BEFORE iterating through neighbors to avoid cycles
        visited.put(node, cloneNode);

        // Iterate through the neighbors to generate their clones recursively
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }
}