

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hey! welcome to our group project application.1");
        System.out.println("Choose which app to run:");
        System.out.println("1 - samartcity app");
        System.out.println("2 - data sorting algorithms app");
        System.out.println("3 - performance analyzer app");
        System.out.println("4 - exit");
        System.out.print("enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                //call samartcity app
                SmartCityApp.module1(new String[]{}); 
                break;
            case "2":
                //call sorting algorithms app
                DataSorting.module2(new String[]{}); 
                break;
            case "3":
                //call performance analyzer app
                Module3_PerformanceAnalyzer.module3(new String[]{}); 
                break;
            case "4":
                System.out.println("exiting.");
                break;
            default:
                System.out.println("unknown choice.");
        }

        scanner.close();
    }
}

