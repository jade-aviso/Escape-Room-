package components.rooms;

import components.Player;
import components.core.Puzzle;

public class Room3 extends Puzzle {
    private final Player player; // Store player reference

    public Room3(Player player) { // Constructor to receive player
        this.player = player;
    }

    @Override
    public boolean play() { // Correct method signature (no parameters)
        int chances = 3;
        String hintAnswer;
        String word;

        System.out.println("Final Room! You can't mess this up.");
        System.out.println("Unscramble the word: 'olpioopqseaoeiitibohanrtpshspuopmpod'");

        while (chances > 0) {
            System.out.print("Your answer: ");
            word = scanner.nextLine().trim().toLowerCase();

            if (word.equals("hippopotomonstrosesquippedaliophobia")) {
                System.out.println("You did it! You ESCAPED!");
                return true; // Player passed the room
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("Try again! Chances left: " + chances);
                    if (chances == 2) {
                        System.out.println("Would you like a hint? Y/N");
                        hintAnswer = scanner.nextLine();
                        if (hintAnswer.equalsIgnoreCase("y")) {
                            System.out.println("Your hint is: The fear of long words.");
                        }
                    }
                }
            }
        }

        // Player failed all chances
        System.out.println("Come on man, you were almost there.");
        System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
        System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
        System.out.println(" \\ V / | | | | | | | | | | ||  _| | | | | |");
        System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
        System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
        System.out.println("You stayed trapped there forever!");

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
