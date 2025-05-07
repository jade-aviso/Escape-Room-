import components.rooms.Room1;
import components.rooms.Room2;
import components.rooms.Room3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Escape Room Game!");
        System.out.println(TEXT_BLUE + "█████████████████████████████████" + TEXT_RESET);
        System.out.println(TEXT_GREEN + "█  █  █  █   █   █  █  █  █  █  █" + TEXT_RESET);
        System.out.println(TEXT_YELLOW + "█  █  █ Can you Escape?█  █  █  █" + TEXT_RESET);
        System.out.println(TEXT_GREEN + "█  █  █  █   █   █  █  █  █  █  █" + TEXT_RESET);
        System.out.println(TEXT_BLUE + "█████████████████████████████████" + TEXT_RESET);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Choose your path.");
        System.out.println("A. Instructions");
        System.out.println("B. START YOUR ESCAPE (enter any key)");

        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("A")){
            System.out.println("Instructions: 1)Guess the riddles correctly.");
            System.out.println("              2)You have 3 chances for each room.");
            System.out.println("              2)Don't die.");
            System.out.println(" ");
        }
        //option two: start 
       

                
            Room1 r1 = new Room1();
            if (!r1.play()) {
            scanner.close();
            return;
        }

            Room2 r2 = new Room2();
            if (!r2.play()) {
            scanner.close(); 
            return;
        }

            Room3 r3 = new Room3();
            if (!r3.play()) {
            scanner.close();
            return;
        }

            System.out.println("\n*** Congratulations! You made it out! ***");
            System.out.println("Your prize is:");
            System.out.println();
            System.out.println("  _     _____     _____ _   _  ____ ");
            System.out.println("  | |   |_ _\\ \\   / /_ _| \\ | |/ ___|");
            System.out.println("  | |    | | \\ \\ / / | ||  \\| | |  _ ");
            System.out.println("  | |___ | |  \\ V /  | || |\\  | |_| |");
            System.out.println("  |_____|___|  \\_/  |___|_| \\_|\\____|");
    
        
        
        scanner.close();
    }

    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static final String TEXT_RESET = "\u001B[0m";
    
}
