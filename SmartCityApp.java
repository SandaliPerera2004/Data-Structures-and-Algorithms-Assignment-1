import java.util.Scanner;

public class SmartCityApp {
    private static CityBST cityTree = new CityBST();
    private static RoadGraph cityGraph = new RoadGraph();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n********** SMART CITY INTEGRATED SYSTEM **********");
            System.out.println("--- Module 1: Route Planner (Thisara Dilshan) ---");
            System.out.println("1. Add New Location (City)");
            System.out.println("2. Add Road (Connect Two Cities)");
            System.out.println("3. Display Registered Cities (BST Order)");
            System.out.println("4. Display All Road Connections (Graph)");

            System.out.println("\n--- Module 2 & 3: Other Members ---");
            System.out.println("5. Data Sorter Tool (Member 2 - Sadali)");
            System.out.println("6. Performance Analyzer (Member 3 - Thishamini)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.next();
                    cityTree.insert(city);
                    cityGraph.addLocation(city);
                    System.out.println(city + " added to system.");
                    break;
                case 2:
                    System.out.print("Enter start city: ");
                    String s = scanner.next();
                    System.out.print("Enter end city: ");
                    String e = scanner.next();
                    cityGraph.addRoad(s, e);
                    break;
                case 3:
                    System.out.println("\n--- Registered Cities (Alphabetical Order - BST) ---");
                    cityTree.displayCities(cityTree.root);
                    break;
                case 4:
                    cityGraph.displayGraph();
                    break;
                case 5:
                    // Sadali's Module
                    System.out.println("\nCalling Data Sorter Module...");
                    DataSorting.showMenu();
                    break;
                case 6:
                    // Thishamini's Module
                    System.out.println("\nCalling Performance Analyzer Module...");
                    Module3_PerformanceAnalyzer.main(null);
                    break;
                case 7:
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 7);
    }
}