public class GraphTest {
	public static void main(String[] args) {
		Graph graph = new Graph(13);

		graph.addEdge(0,5);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(0,6);

		graph.addEdge(3,4);
    	graph.addEdge(3,5);

		graph.addEdge(4,6);
		graph.addEdge(4,5);

		graph.addEdge(7,8);

    	graph.addEdge(9,12);
    	graph.addEdge(9,10);
    	graph.addEdge(9,11);
    	
    	graph.addEdge(11,12);
    	
    	System.out.print(graph.toString());

    	System.out.println("\nThe Degree Of Vertex in 0 is " + graph.degree(0));
    	System.out.println("The Degree Of Vertex in 1 is " + graph.degree(1));
    	System.out.println("The Degree Of Vertex in 4 is " + graph.degree(4));

    	System.out.println("Vertices: " + graph.V());
    	System.out.println("Edges: " + graph.E());

    	assert(graph.E() == 13);
    	assert(graph.V() == 13);
    	System.out.println("\nAll Test Cases Passed.");
    	
	}
}