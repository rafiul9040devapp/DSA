package Graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    public int numberOfVertexes;
    public List<List<Integer>> adjacencyList;

    public DepthFirstSearch(int numberOfVertexes){
        this.numberOfVertexes = numberOfVertexes;
        //After getting the vertexes I have to prepare the Arraylist
        adjacencyList = new ArrayList<>(numberOfVertexes);

        for (int i = 0; i < numberOfVertexes; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    
}
