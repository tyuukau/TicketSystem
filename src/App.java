import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    private static Scanner scanner = new Scanner(System.in);
    private static Cart cart = new Cart();

    private static Station stationA = new Station("A", 0);
    private static Station stationB = new Station("B", 2.5);
    private static Station stationC = new Station("C", 5.1);
    private static Station stationD = new Station("D", 7.9);

    private static StationSystem system = new StationSystem(stationA, stationC, stationB, stationD);

    public static void main(String[] args) throws Exception 
    {
        showMenu();
    }

    public static void showMenu() 
    {
		System.out.println("Ticket system:\n"
                         + "--------------------------------\n"
                         + "1. One-way ticket\n" // oneWayTicketMenu()
                         + "2. Twenty-four-hour ticket\n" // twentyFourHourTicketMenu()
                         + "3. Prepaid card\n" // prepaidCardMenu()
                         + "0. Exit\n"
                         + "--------------------------------\n"
                         + "Please choose a number: 0-1-2-3");
				
		int choice = getChoice(3);

        switch (choice) 
        {
            case 1:
                oneWayTicketMenu();
                break;
            case 2:
                twentyFourHourTicketMenu();
                break;
            case 3:
                prepaidCardMenu();
                break;
            case 0:
                System.out.println("Thank you for using our service. We hope to see you again.");
			    System.exit(0);
                break;
            default:
                break;
        }
    }

    public static void oneWayTicketMenu() 
    {
        oneWayTicketSpecifier();
        cart.print();

        while(true)
        {
            System.out.println("Confirm and place the order = 0 | Buy other tickets = 1");
            int choice = getChoice(1);
            if (choice == 1)
            {
                oneWayTicketSpecifier();
                cart.print();        
            }
            else
            {
                confirmScreen();
                break;         
            }
        }
    }

    public static void oneWayTicketSpecifier()
    {
        system.print();
        System.out.println("One-way Ticket Menu");
        System.out.println("Starting Station Name: ");
        String startingStationName = scanner.nextLine();
        Station startingStation = system.searchStation(startingStationName);
        System.out.println("Ending Station Name: ");
        String endingStationName = scanner.nextLine();
        Station endingStation = system.searchStation(endingStationName);

        TicketOneWay oneWayTicketToBuy = new TicketOneWay(startingStation, endingStation);
        System.out.println(oneWayTicketToBuy);
        System.out.println("How many tickets would you like to buy?");
        Integer numberToBuy = scanner.nextInt();

        for (int i = 0; i < numberToBuy; i++)
        {
            cart.addTicket(oneWayTicketToBuy);
        }
    }

    public static void twentyFourHourTicketMenu() 
    {

    }

    public static void prepaidCardMenu() 
    {

    }

    public static void confirmScreen()
    {
        System.out.println("Done!");
        cart.print();
        System.out.println("The order is placed.");
        cart.empty();
        showMenu();
    }

    private static int getChoice(int max) 
    {
        Integer input = scanner.nextInt();
		scanner.nextLine();
        ArrayList<Integer> choices = new ArrayList<Integer>();
        for (int i = 0; i < (max + 1); i++) {
            choices.add(Integer.valueOf(i));
        }
		while (!choices.contains(input)) {
			System.out.println("Please choose a valid number.");
			input = scanner.nextInt();
			scanner.nextLine();
		}
        return input;
    }
    
}
