import java.util.Scanner;

public class DayCare {
    /*Doggy Daycare
    * on start up we should be able to input the number of daycare spots available
    * we should be able to check a dog into our daycare
    * we should be able to check a dog out of our daycare
    * we should be able to view all dogs in our care
    * we should be able to exit our program
    * */

    // variables
    static Scanner console = new Scanner(System.in);
    static String [] daycareSpaces;
    static int capacity;

    // main method
    public static void main(String[] args) {
        startUp();
    }

    // Methods
    public static void startUp(){
        System.out.println("Welcome to the Doggy Daycare");
        System.out.print("Please enter the number of spaces available for today: ");

        capacity = Integer.parseInt(console.nextLine());
        daycareSpaces = new String[capacity];
        menu();

    }

    public static void menu(){
        boolean exit = false;
        do{
            System.out.println("What would you like to do?");
            System.out.println("1. Check a dog into daycare");
            System.out.println("2. Check a dog out of daycare");
            System.out.println("3. View all dogs in our care");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            int choice = Integer.parseInt(console.nextLine());
            switch(choice){
                case 1:
                    checkInDog();
                    break;
                case 2:
                    checkOutDog();
                    break;
                case 3:
                    viewAllDogs();
                    break;
                case 4:
                    System.out.println("\n Thank you for visiting the Doggy Day Care, have a nice day!");
                    exit = true;
                    break;
                default:
                    System.out.println("That is not a valid choice, please try again.");
            }
        } while(!exit);
    }

    // check in a dog
    public static void checkInDog(){
        System.out.println("\nWho is the good dog visiting us today?: ");
        String dogName = console.nextLine();

        for (int i = 0; i < daycareSpaces.length; i++) {
            if(daycareSpaces[i] == null){
                daycareSpaces[i] = dogName;
                System.out.println("\n" + dogName + " has been checked in to the daycare! See you this evening for pickup!");
                return;
            }
        }
        System.out.println("\n Sorry, there is no space available today, We are fully booked!");
    }
    // check out a dog
    public static void checkOutDog(){
        System.out.print("\n What is the name of the dog you are picking up? ");
        String dogName = console.nextLine();

        for (int i = 0; i < daycareSpaces.length; i++) {
            if(daycareSpaces[i] != null && daycareSpaces[i].equalsIgnoreCase(dogName)){
                daycareSpaces[i] = null;
                System.out.println("\n" + dogName + " has successfully been picked up by it's owner.");
                return;
            }
        }
        System.out.println("\n Sorry, we can't find your dog. I don't think its checked into our day care today");
    }
    // view all dogs in our care
    public static void viewAllDogs(){
        System.out.println("\n Current Dogs in Our Care");
        int availableSpace = 0;
        for (int i = 0; i < daycareSpaces.length; i++) {
            if(daycareSpaces[i] != null){
                System.out.println(daycareSpaces[i]);
            } else {
                availableSpace++;
            }
        }
        System.out.println("Available Spaces: " + availableSpace);

    }
}
