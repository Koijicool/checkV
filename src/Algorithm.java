import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
// we implement clark and write

public class Algorithm {

    private List<Vertex> vertices;
    private PriorityQueue<SavingPairs> Q;
    private List<SavingPairs> SortList;
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

// Step 3 Merge the route




        }

    }
}
