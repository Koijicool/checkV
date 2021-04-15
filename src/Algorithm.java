import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
// we implement clark and write

public class Algorithm {

    private List<Vertex> vertices;
    private PriorityQueue<SavingPairs> Q;
    private List<SavingPairs> SortList;
    private int capacity=80;
// Step 1: calculate saving s(i,j) = d(D,i)+ d(D,j) - d(i,j) we have done it since we input data in  the saving Pairs
    public Algorithm(Graph graph) {
        this.vertices = graph.getVertices();
        this.Q = new PriorityQueue<SavingPairs>();
        this.SortList = new ArrayList<SavingPairs>();
// Step 2: Rank the data, in this step we put all saving pair into the priority Q and then sort them decending order of saving
        for (SavingPairs SavingPairs : graph.getSavingPairsList()) {
            this.Q.add(SavingPairs);
        }

        while (!Q.isEmpty()) {
            // System.out.println(Q.poll());
            SavingPairs getout = Q.poll();
            SortList.add(getout);
        }
        System.out.println("After sort");
        System.out.println(SortList);
        for (SavingPairs SavingPairs:SortList) {
            System.out.println("Saving Pair: "+SavingPairs);
            System.out.println("Saving: "+SavingPairs.getWeight());
            System.out.println("start: "+SavingPairs.getStartVertex());
            System.out.println("target: "+SavingPairs.getTargetVertex());
            System.out.println("start Demand: "+SavingPairs.getStartVertex().getDemand());
            System.out.println("End Demad: "+SavingPairs.getTargetVertex().getDemand());
            System.out.println("");
            System.out.println("");

        }


        // Step 3 create route
        System.out.println("All vertex"+vertices);
        System.out.println("List afeter sort"+SortList);
        Route route_temp = new Route();

//route_temp.Contains(s.getTargetVertex()) OR route_temp.Contains(s.getTargetVertex()))


        for(SavingPairs s:SortList) {

            if(route_temp.getTotaldemand() <= capacity) {
                if(route_temp.Contains(s.getStartVertex())){
                   // route_temp.Remove(s.getStartVertex());
                    route_temp.AddRoute(s.getStartVertex());
                    route_temp.AddDemand(s.getStartVertex().getDemand());
                }
                if (route_temp.Contains(s.getTargetVertex())){
                   // route_temp.Remove(s.getTargetVertex());
                    route_temp.AddRoute(s.getTargetVertex());
                    route_temp.AddDemand(s.getTargetVertex().getDemand());

                }
            }
            vertices.remove(s.getStartVertex());
            vertices.remove(s.getTargetVertex());
        }

        System.out.println("Route temp"+route_temp);
        System.out.println(vertices);
        System.out.println(route_temp.getTotaldemand());





// Step 4 merge

    }
}
