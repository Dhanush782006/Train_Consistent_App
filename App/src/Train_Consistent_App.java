import java.util.LinkedList;
import java.util.List;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 * File Name: Train_Consistent_App.java
 * Author: DHANUSH_REDDY
 *
 * Note: While the UC4 title mentioned TreeSet/SortedSet, the requirements
 * and logic specifically call for LinkedList to model the physical
 * chaining and sequence of a train consist.
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("\nAssembling the Train...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Sequence: " + trainConsist);

        System.out.println("\nAdding Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("Updated Sequence: " + trainConsist);


        System.out.println("\nDetaching Engine and Guard coach...");
        trainConsist.removeFirst();
        trainConsist.removeLast();


        System.out.println("Final Ordered Consist: " + trainConsist);
        System.out.println("Total Bogies remaining: " + trainConsist.size());

        System.out.println("------------------------------------");
        System.out.println("UC4 Sequence Management Completed.");
    }
}import java.util.LinkedList;
import java.util.List;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 * File Name: Train_Consistent_App.java
 * Author: DHANUSH_REDDY
 *
 * Note: While the UC4 title mentioned TreeSet/SortedSet, the requirements
 * and logic specifically call for LinkedList to model the physical
 * chaining and sequence of a train consist.
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("\nAssembling the Train...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Sequence: " + trainConsist);


        System.out.println("\nAdding Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("Updated Sequence: " + trainConsist);

        System.out.println("\nDetaching Engine and Guard coach...");
        trainConsist.removeFirst();
        trainConsist.removeLast();


        System.out.println("Final Ordered Consist: " + trainConsist);
        System.out.println("Total Bogies remaining: " + trainConsist.size());

        System.out.println("------------------------------------");
        System.out.println("UC4 Sequence Management Completed.");
    }
}