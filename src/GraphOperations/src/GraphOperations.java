/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  In this Kata, you will be given a graph consisting of Vertices and Edges, and your task is to complete the following function:										*
 *																																										*
 *	public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex)																									*
 *																																										*
 *	This function will receive the graph and a vertex as a parameter, and should return all neighbours of the vertex in the graph. No vertex is a neighbour of itself.	*
 *																																										*
 *	This is a traditional, undirected, unweighted - however not necessarily connected - graph without duplicate edges. The graph consists of Vertex and Edge objects: 	*
 *	each edge will have 2 different vertex endpoints, but not all vertices may be on edges.																				*
 *																																										*
 *	Graph, Vertex and Edge will all be preloaded for you and should not be modified. However, for simpler offline development and better understanding the full 		*
 *	code of these classes will be provided in the end of the description. The methods that should interest you in this Kata are the following:							*
 *																																										*
 *	public Set<Vertex> getVertices() in Graph that returns a set of all vertices of the graph.																			*
 *																																										*	
 *	public Set<Edge> getEdges() in Graph that returns a set of all edges of the graph.																					*
 *																																										*
 *	public Vertex getV1() and public Vertex getV2() in Edge that return the Vertex endpoints of an edge.																*
 *																																										*
 *	Both Vertex and Edge has hashCode and equals implemented.                                   																		*
 *   																									 															    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * */



import java.util.HashSet;
import java.util.Set;

public class GraphOperations {

    public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex){
        //Have fun coding!
        Set<Vertex> neighbours = new HashSet<>();

        // loop over the graph edges
        for (Edge edge: graph.getEdges())
        {
            //for visual purpose
            System.out.println(edge.getV1() + " " + edge.getV2());

            if (edge.getV1().equals(vertex))
            {
                neighbours.add(edge.getV2());
            } else if (edge.getV2().equals(vertex))
            {
                neighbours.add(edge.getV1());
            }
        }
        System.out.println("");
        return neighbours;
    }
}