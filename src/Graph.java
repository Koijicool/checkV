import java.util.ArrayList;
import java.util.List;
//this class is a graph, the graph manages add vertices and add  Saving Pairs.
// we also make measure distance method, and calculate saving here.

public class Graph {

    private List<Vertex> vertices;
    private List<SavingPairs> SavingPairsList;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.SavingPairsList = new ArrayList<>();
    }

    public void addVertex(Vertex vertex) {
        this.vertices.add(vertex);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public void addSavingPairs(SavingPairs SavingPairs) {
        Vertex startVertex = SavingPairs.getStartVertex();
        Vertex targetVertex = SavingPairs.getTargetVertex();

        this.vertices.get(vertices.indexOf(startVertex)).addSavingPairs(new SavingPairs(startVertex, targetVertex, SavingPairs.getWeight()));
        this.vertices.get(vertices.indexOf(targetVertex)).addSavingPairs(new SavingPairs(targetVertex, startVertex, SavingPairs.getWeight()));
        this.SavingPairsList.add(SavingPairs);
    }


// calcualate Euclidean distance
    public double measuredistance(Vertex startVertex, Vertex targetVertex) {
        double deltaX = (startVertex.getX() - targetVertex.getX());
        double deltaY = (startVertex.getY() - targetVertex.getY());
        double dis = Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
        return dis;

    }

//calculate saving s(i,j) = d(D,i)+ d(D,j) - d(i,j)

    public double calsaving(Vertex i, Vertex j){
        double saving = measuredistance(vertices.get(0),i)+measuredistance(vertices.get(0),j)-measuredistance(i,j);
        return saving;
    }


    public List<SavingPairs> getSavingPairsList() {
        return SavingPairsList;
    }

    public void setSavingPairsList(List<SavingPairs> SavingPairsList) {
        this.SavingPairsList = SavingPairsList;
    }
}