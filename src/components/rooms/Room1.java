package components.rooms;

import components.core.Puzzle;
import java.util.*;

public class Room1 extends Puzzle {

    @Override
    public boolean play() {
        int chances = 3;
        String hintAnswer;

        // List of riddles
        List<String[]> riddles = Arrays.asList(
            new String[]{"What has keys but can't open locks?", "piano", "Music."},
            new String[]{"What has to be broken before you can use it?", "egg", "Found in kitchens."},
            new String[]{"I speak without a mouth and hear without ears. What am I?", "echo", "Sound."},
            new String[]{"The more of me you take, the more you leave behind. What am I?", "footsteps", "You make me when you walk."}
        );

        // Pick one riddle randomly
        Random rand = new Random();
        String[] chosen = riddles.get(rand.nextInt(riddles.size()));
        String riddle = chosen[0];
        String answer = chosen[1].toLowerCase();
        String hint = chosen[2];

        System.out.println("Welcome to Room 1!");
        System.out.println("Solve this riddle to move on:");
        System.out.println(riddle);

        while (chances != 0) {
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.contains(answer)) {
                System.out.println("Correct! You may proceed.");
                return true;
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

        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀");
        System.out.println("⣿⣿⣿⣿ FR?First Room?⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⡏⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠁⠀⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠙⠿⠿⠿⠻⠿⠿⠟⠿⠛⠉⠀⠀⠀⠀⠀⣸⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣴⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⢰⣹⡆⠀⠀⠀⠀⠀⠀⣭⣷⠀⠀⠀⠸⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠈⠉⠀⠀⠤⠄⠀⠀⠀⠉⠁⠀⠀⠀⠀⢿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⢾⣿⣷⠀⠀⠀⠀⡠⠤⢄⠀⠀⠀⠠⣿⣿⣷⠀⢸⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡀⠉⠀⠀⠀⠀⠀⢄⠀⢀⠀⠀⠀⠀⠉⠉⠁⠀⠀⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿");
        System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
        System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
        System.out.println(" \\ V / | | | | | | | | | | ||  _| | | | | |");
        System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
        System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
        System.out.println("You stayed trapped there forever!");
        return false;
    }
}
