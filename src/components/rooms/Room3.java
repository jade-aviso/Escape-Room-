package components.rooms;

import components.core.Puzzle;

public class Room3 extends Puzzle {
    @Override
    public boolean play() {
        System.out.println("Final Room!You can't mess this up.");
        System.out.println("Unscramble the word: 'REPAESC'");
        String word = scanner.nextLine().trim().toLowerCase();

        if (word.equals("escape")) {
            System.out.println("You did it! You ESCAPED!");
            return true;
        } else {
            System.out.println("Come on man, you were almost there.");
            System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
            System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
            System.out.println(" \\ V / | | | | | | | | | | ||  _| | | | | |");
            System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
            System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
            return false;
        }
    }
}
