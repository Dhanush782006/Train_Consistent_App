import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * File Name: Train_Consistent_App.java
 * Author: Dhanush_Reddy
 */
public class Train_Consistent_App {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");


        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("First Class");

        Set<String> bogieIds = new HashSet<>();


        System.out.println("\nRegistering Bogie IDs...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");

        System.out.println("Registered Unique Bogie IDs: " + bogieIds);
        System.out.println("Total Unique IDs tracked: " + bogieIds.size());


        if (bogieIds.contains("BG101")) {
            System.out.println("System Check: Bogie BG101 is successfully registered and unique.");
        }

        System.out.println("------------------------------------");
        System.out.println("UC3 Uniqueness Constraints applied successfully.");
    }
}