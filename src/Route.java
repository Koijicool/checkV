import java.util.ArrayList;
import java.util.List;

public class Route {

    private double totalsaving;
    private Vertex startVertex;
    private Vertex targetVertex;
    private double totaldemand;
    private double savings;
    private List<Vertex> assignedVertices;

    Route() {
        assignedVertices = new ArrayList<Vertex>();
        totaldemand = 0;
        savings = 0;
    }

    public double getTotalsaving() {
        return totalsaving;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
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
        this.assignedVertices.add(vertex);

   }
   void Remove(Vertex vertex){
        this.assignedVertices.remove(vertex);
   }

   boolean Contains(Vertex vertex){
        this.assignedVertices.contains(vertex);
       return true;
   }

   void AddDemand(double demand){
        this.totaldemand= totaldemand+demand;
   }
    @Override
    public String toString() {
        return String.valueOf(assignedVertices);
    }

}
