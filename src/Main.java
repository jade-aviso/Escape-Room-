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
        if(answer.equals("A")){
            System.out.println("instructions");
        }
        //option two: start 
       

                
            Room1 r1 = new Room1();
            if (!r1.play()) return;

            Room2 r2 = new Room2();
            if (!r2.play()) return;

            Room3 r3 = new Room3();
            if (!r3.play()) return;

            System.out.println("\n*** Congratulations! You made it out! ***");
            System.out.println("Your prize is:");
            System.out.println();
            System.out.println(" _   _  ___ _____ _   _ ___ _   _  ____ ");
            System.out.println("| \\ | |/ _ \\_   _| | | |_ _| \\ | |/ ___|");
            System.out.println("|  \\| | | | || | | |_| || ||  \\| | |  _ ");
            System.out.println("| |\\  | |_| || | |  _  || || |\\  | |_| |");
            System.out.println("|_| \\_|\\___/ |_| |_| |_|___|_| \\_|\\____|");
    
        
        

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
