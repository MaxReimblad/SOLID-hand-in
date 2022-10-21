import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner userInput = new Scanner(System.in);
        DumpMore docks = new DumpMore();
        // List variable

        // Menu
        boolean ending = true;
        do {
            System.out.println("--- Welcome to DumpMore ---");
            System.out.print("""
                1. See parked trucks
                2. Register new truck
                3. Exit
                """);
            System.out.print("Choose from the list: ");
            String input = userInput.nextLine();

            if (input.equals("1")) {

                System.out.println(/*List*/);

                System.out.println();
                Thread.sleep(2000);

            } else if (input.equals("2")) {

                // Input command for truck
                Scanner userInputType = new Scanner(System.in);
                Scanner userInputWeight = new Scanner(System.in);
                System.out.println();
                System.out.print("""
                        Type of truck:
                        
                        1. Van
                        2. Small truck
                        3. Big truck
                        
                        Choose type of truck:
                        """);
                String inputType = userInputType.next();
                System.out.print("Input weight of truck (in kg): ");
                int inputWeight = userInputWeight.nextInt();

                Vehicle vehicle;
                if (inputType.equals("1")){
                    vehicle = new Van(inputType, inputWeight);

                } else if (inputType.equals("2")){
                    vehicle = new SmallTruck(inputType, inputWeight);

                } else if (inputType.equals("3")){
                    vehicle = new BigTruck(inputType, inputWeight);

                } else {

                    System.out.println();
                    System.out.println("That's not an option! \n");
                    continue;
                }


                docks.addVehicle(vehicle);
                System.out.println("Truck registered at bay ");
                System.out.println();

            } else if (input.equals("3")) {

                System.out.println();
                System.out.println("Goodbye!");
                Thread.sleep(1000);
                ending = false;

            } else {

                System.out.println();
                System.out.println("That's not an option! \n");
                Thread.sleep(2000);
            }
        }while (ending);
    }
}