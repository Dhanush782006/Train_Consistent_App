import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * File Name: Train_Consistent_App.java
 * Author: DHANUSH_REDDY
 */
public class Train_Consistent_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies Added: " + passengerBogies);
        System.out.println("Current Bogie Count: " + passengerBogies.size());

        System.out.println("\nRemoving AC Chair...");
        passengerBogies.remove("AC Chair");


        System.out.println("Is 'Sleeper' still in the consist? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final Passenger Consist: " + passengerBogies);
        System.out.println("Total Bogies: " + passengerBogies.size());

        System.out.println("------------------------------------");
        System.out.println("UC2 Operations Completed successfully.");
    }
}