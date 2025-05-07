package components.rooms;

import components.Player;
import components.core.Puzzle;
import java.util.*;

public class Room2 extends Puzzle {
    private final Player player; // Store player reference

    public Room2(Player player) { // Constructor to receive player
        this.player = player;
    }

    @Override
    public boolean play() { // Correct method signature (no parameters)
        int chances = 3;
        String hintAnswer;

        // List of 3-digit number riddles
        List<String[]> riddles = Arrays.asList(
            new String[]{"The code is the same forwards and backwards.", "121", "A palindrome."},
            new String[]{"Each digit is greater than the last.", "123", "Increasing order."},
            new String[]{"All digits are the same.", "777", "Lucky number."}
        );

        // Pick one riddle randomly
        Random rand = new Random();
        String[] chosen = riddles.get(rand.nextInt(riddles.size()));
        String riddle = chosen[0];
        String answer = chosen[1];
        String hint = chosen[2];

        System.out.println("Welcome to Room 2!");
        System.out.println(riddle);

        while (chances != 0) {
            System.out.print("Your answer: ");
            String code = scanner.nextLine().trim();

            if (code.equals(answer)) {
                System.out.println("Finally, you made it past the first round.");
                return true; // Player passed the room
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("Try again! Chances left: " + chances);

                    if (chances == 2) {
                        System.out.println("Would you like a hint? Y/N");
                        hintAnswer = scanner.nextLine();
                        if (hintAnswer.equalsIgnoreCase("Y")) {
                            System.out.println("Your hint is: " + hint);
                        }
                    }
                }
            }
        }

        // Player failed all chances
        System.out.println("Surely you can do better than that.");
        System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
        System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
        System.out.println(" \\ V / | | | | | | | | | | || 0_| | | | | |");
        System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
        System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
        System.out.println("You stayed trapped forever!");

        player.loseLife(); // Decrement lives

        if (player.getLife() <= 0) {
            System.out.println("GAME OVER! No lives left.");
            return false; // End the game
        } else {
            System.out.println("You have " + player.getLife() + " lives left. Try again!");
            return true; // Allow retry
        }
    }
}
