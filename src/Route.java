import java.util.ArrayList;
import java.util.List;

public class Route {

    private double totaldistance;
    //private Vertex startVertex;
    //private Vertex targetVertex;
    private double totaldemand;
    private double savings;
    private List<Vertex> orderedVertices;

    Route() {
        orderedVertices = new ArrayList<Vertex>();
        totaldemand = 0;
        savings = 0;
    }

    public double getTotaldistance() {
        return totaldistance;
    }

    public Vertex getStartVertex() {
        return orderedVertices.get(0);
    }

    public Vertex getTargetVertex() {
        return orderedVertices.get(orderedVertices.size()-1);
    }

    public double getTotaldemand() {
        return totaldemand;
    }

    public double getSavings() {
        return savings;
    }

    public void setTotaldemand(double totaldemand) {
        this.totaldemand = totaldemand;
    }

    void AddRoute(Vertex vertex){
        this.orderedVertices.add(vertex);

   }
   void Remove(Vertex vertex){
        this.orderedVertices.remove(vertex);
   }

   boolean Contains(Vertex vertex){
        this.orderedVertices.contains(vertex);
       return true;
   }

   void AddDemand(double demand){
        this.totaldemand= totaldemand+demand;
   }
    @Override
    public String toString() {
        return String.valueOf(orderedVertices);
    }

}
