package components.rooms;

import components.core.Puzzle;

public class Room3 extends Puzzle {
    @Override
    public boolean play() {
        int chances = 3;
        String hintAnswer;
        String word;

        System.out.println("Final Room!You can't mess this up.");
        System.out.println("Unscramble the word: 'REPAESC'");
       

        
    while (chances > 0) {
        System.out.print("Your answer: ");
        word = scanner.nextLine().trim().toLowerCase();

        if (word.equals("escape")) {
            System.out.println("You did it! You ESCAPED!");
            return true;
        }
         else {
            chances--;
            if (chances > 0) {
                System.out.println("Try again! Chances left: " + chances);
                //if it is first time losing
                    if(chances == 2){
                        //want a hint?
                        System.out.println("Would you like a hint? Y/N");
                        //scanner
                        hintAnswer = scanner.nextLine();
                        //if yes
                            if(hintAnswer.equals("Y")){System.out.println("this is hint");}
                    
                    }
            }
        }
    }

    // If the user didn't guess correctly in 3 tries, show the losing message
    System.out.println("Come on man, you were almost there.");
    System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
    System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
    System.out.println(" \\ V / | | | | | | | | | | ||  _| | | | | |");
    System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
    System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
    return false;
    }
}