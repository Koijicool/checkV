public class Main {
//Just a temporary comment to show that Nina got access
//Just try from Tony

    public static void main(String[] args) {
	// write your code here
        Graph graph = new Graph();
        Vertex vertex0  = new Vertex(0,0,0,0);
        graph.addVertex(vertex0);
        Vertex vertex1  = new Vertex(1,10,10,10);
        graph.addVertex(vertex1);
        Vertex vertex2  = new Vertex(2,20,20,20);
        graph.addVertex(vertex2);

        Vertex vertex3  = new Vertex(3,10,25,30);
        graph.addVertex(vertex3);
/*
        graph.addSavingPairs(new SavingPairs(vertex0,vertex1,graph.measuredistance(vertex0,vertex1)));
        graph.addSavingPairs(new SavingPairs(vertex0,vertex2,graph.measuredistance(vertex0,vertex2)));
        graph.addSavingPairs(new SavingPairs(vertex0,vertex3,graph.measuredistance(vertex0,vertex3)));
        System.out.println(graph.measuredistance(vertex0,vertex1));
        System.out.println(graph.measuredistance(vertex0,vertex3));
        System.out.println(graph.measuredistance(vertex1,vertex3));
        System.out.println(graph.calsaving(vertex1,vertex3));

     //add the saving pairs into the graph.
 */
        graph.addSavingPairs(new SavingPairs(vertex0,vertex1,graph.calsaving(vertex0,vertex1)));
        graph.addSavingPairs(new SavingPairs(vertex0,vertex2,graph.calsaving(vertex0,vertex2)));
        graph.addSavingPairs(new SavingPairs(vertex0,vertex3,graph.calsaving(vertex0,vertex3)));
        graph.addSavingPairs(new SavingPairs(vertex1,vertex2,graph.calsaving(vertex1,vertex2)));
        graph.addSavingPairs(new SavingPairs(vertex2,vertex3,graph.calsaving(vertex2,vertex3)));

// test the code
       // System.out.println(graph.measuredistance(vertex0,vertex1));
      //  System.out.println(graph.measuredistance(vertex0,vertex3));
      //  System.out.println(graph.measuredistance(vertex1,vertex3));

     //   System.out.println(graph.calsaving(vertex1,vertex2));
     //   System.out.println(graph.calsaving(vertex2,vertex3));
     //   System.out.println(graph.calsaving(vertex0,vertex2));
     //   System.out.println(graph.calsaving(vertex0,vertex3));
      //  System.out.println(graph.calsaving(vertex0,vertex3));
     //   System.out.println(graph.calsaving(vertex0,vertex1));


   //     System.out.println(graph.getSavingPairsList().get(2).getTargetVertex().getDemand());

        System.out.println(graph.getSavingPairsList());
        new Algorithm(graph);
    }
}
