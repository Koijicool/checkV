import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
//Just a temporary comment to show that Nina got access
//Just try from Tony


    public static void main(String[] args) {
        // write your code here
        Graph graph = readFile();
     /*
        Graph graph = new Graph();
        Vertex vertex0  = new Vertex(0,0,0,0);
        graph.addVertex(vertex0);
        Vertex vertex1  = new Vertex(1,10,10,10);
        graph.addVertex(vertex1);
        Vertex vertex2  = new Vertex(2,20,20,20);
        graph.addVertex(vertex2);

        Vertex vertex3  = new Vertex(3,10,25,30);
        graph.addVertex(vertex3);

      */
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
/*
        graph.addSavingPairs(new SavingPairs(vertex0,vertex1,graph.calsaving(vertex0,vertex1)));
        graph.addSavingPairs(new SavingPairs(vertex0,vertex2,graph.calsaving(vertex0,vertex2)));
        graph.addSavingPairs(new SavingPairs(vertex0,vertex3,graph.calsaving(vertex0,vertex3)));
        graph.addSavingPairs(new SavingPairs(vertex1,vertex2,graph.calsaving(vertex1,vertex2)));
        graph.addSavingPairs(new SavingPairs(vertex2,vertex3,graph.calsaving(vertex2,vertex3)));
*/
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

    private static double capacity=35;
    public static Graph readFile() {
        Graph graph = new Graph();
        File myFile = new File("/Users/suthongchaisuriyasuphapong/Documents/4th_SEM/Project/trydata.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] line = data.split(" ");
            Vertex v = new Vertex(Integer.parseInt(line[0]), Double.parseDouble(line[1]), Double.parseDouble(line[2]), Double.parseDouble(line[3]));
            graph.addVertex(v);
        }
        graph.setDepot(graph.getVertices().get(0));
         //   for (Vertex i : graph.getVertices())
           //     for (Vertex j : graph.getVertices()) {
        for(int i=1; i<graph.getVertices().size();i++){
            for(int j=i+1;j<graph.getVertices().size();j++){
                Vertex vi = graph.getVertices().get(i);
                Vertex vj = graph.getVertices().get(j);


                           // for (SavingPairs o : graph.getSavingPairsList()) {
                           //     if(graph.getSavingPairsList().contains(o)&& (o.getStartVertex().equals(i) && o.getTargetVertex().equals(j) && o.getWeight() == graph.calsaving(i, j))) {
                          //          graph.getSavingPairsList().remove(o);
                                //    if(!graph.getSavingPairsList().contains(new SavingPairs(vi,vj,graph.calsaving(vi,vj))))
                //check demand
                System.out.println(vi.getDemand()+"+"+vj.getDemand()+"<="+capacity);
                                if((vi.getDemand()+vj.getDemand())<=capacity)
                                    graph.addSavingPairs(new SavingPairs(vi, vj, graph.calsaving(vi, vj)));
                                else System.out.println("The demand greater than capa city ("+vi.getId()+","+vj.getId()+")");
                               // }
                            }
                            //System.out.println("Print all vertext "+graph.getVertices().get(i)+"to Vertex "+ graph.getVertices().get(j));
                        }
        return graph;
                }


            }




