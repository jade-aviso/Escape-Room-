import components.rooms.Room1;
import components.rooms.Room2;
import components.rooms.Room3;
import components.Player;
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
       
        System.out.print("Enter your name, brave soul: ");
        String name = scanner.nextLine();
        Player player = new Player(name);
        player.interact();
        System.out.println("Stats: " + player);

        boolean gameWon = false;
        while (player.getLife() > 0 && !gameWon) {
            // Room 1
            boolean room1Passed = false;
            while (!room1Passed && player.getLife() > 0) {
                Room1 r1 = new Room1(player);
                room1Passed = r1.play();
            }
            if (player.getLife() <= 0) break;

            // Room 2
            boolean room2Passed = false;
            while (!room2Passed && player.getLife() > 0) {
                Room2 r2 = new Room2(player);
                room2Passed = r2.play();
            }
            if (player.getLife() <= 0) break;

            // Room 3
            boolean room3Passed = false;
            while (!room3Passed && player.getLife() > 0) {
                Room3 r3 = new Room3(player);
                room3Passed = r3.play();
            }
            gameWon = room3Passed; // Only win if Room3 is completed
        }

    

        if (gameWon) {
            System.out.println("\n*** Congratulations! You made it out! ***");
            System.out.println("Your prize is:");
            System.out.println();
            System.out.println("  _     _____     _____ _   _  ____ ");
            System.out.println("  | |   |_ _\\ \\   / /_ _| \\ | |/ ___|");
            System.out.println("  | |    | | \\ \\ / / | ||  \\| | |  _ ");
            System.out.println("  | |___ | |  \\ V /  | || |\\  | |_| |");
            System.out.println("  |_____|___|  \\_/  |___|_| \\_|\\____|");
        }
        else {
            gameOver(scanner);
        }

    scanner.close();
    }

    private static void gameOver(Scanner scanner) {

        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿ GAME OVER! No lives remaining. ⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
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
