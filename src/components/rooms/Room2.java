package components.rooms;

import components.core.Puzzle;

public class Room2 extends Puzzle {
    @Override
    public boolean play() {
        System.out.println("Welcome to Room 2!");
        System.out.println("Guess the 3-digit code: Hint – it's 123 reversed.");
        String code = scanner.nextLine().trim();

        if (code.equals("321")) {
            System.out.println("Finally, you made it passed the first round.");
            return true;
        } else {
            System.out.println("Surely you can do better than that.");
            System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
            System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
            System.out.println(" \\ V / | | | | | | | | | | ||  _| | | | | |");
            System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
            System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
            return false;
        }
    }
}

