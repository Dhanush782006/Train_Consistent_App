import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * File Name: Train_Consistent_App.java
 * Author: DHANUSH_REDDY
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Attach bogies in a specific physical sequence
        System.out.println("\nAttaching bogies to the engine...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");


        System.out.println("Attempting to add duplicate 'Sleeper'...");
        trainFormation.add("Sleeper");

        System.out.println("\nFinal Train Formation (Order Preserved):");
        System.out.println(trainFormation);

        // Step 5: Verify constraints
        System.out.println("\nTotal unique bogies in formation: " + trainFormation.size());
        System.out.println("------------------------------------");
        System.out.println("UC5 Unique Ordered Formation Completed.");
    }
}