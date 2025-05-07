package components.rooms;

import components.core.Puzzle;

public class Room2 extends Puzzle {
    @Override
    public boolean play() {
        int chances = 3;
        String hintAnswer;
        System.out.println("Welcome to Room 2!");
        System.out.println("Guess the 3-digit code: ");
        

        while(chances != 0){
            System.out.print("Your answer: ");
            String code = scanner.nextLine().trim();

            if (code.equals("321")) {
                System.out.println("Finally, you made it passed the first round.");
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
                                if(hintAnswer.equalsIgnoreCase("Y")){
                                    System.out.println("Your hint is: can be counted on one hand.");}
                            
                            }
                        }
            }
        
        }
        System.out.println("Surely you can do better than that.");
            System.out.println("__   _____  _   _   ____ ___ _____ ____  _ ");
            System.out.println("\\ \\ / / _ \\| | | | |  _ \\_ _| ____|  _ \\| |");
            System.out.println(" \\ V / | | | | | | | | | | ||  _| | | | | |");
            System.out.println("  | || |_| | |_| | | |_| | || |___| |_| |_|");
            System.out.println("  |_| \\___/ \\___/  |____/___|_____|____/(_)");
            System.out.println("You stayed trapped forever!");
            return false;
    }
}

