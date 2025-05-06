package components.rooms;

import components.core.Puzzle;

public class Room1 extends Puzzle {
    @Override
    public boolean play() {
        int chances = 4 ;
        String hintAnswer;
        System.out.println("Welcome to Room 1!");
        System.out.println("Solve this riddle to move on:");
        System.out.println("What has keys but can't open locks?");
        String answer = scanner.nextLine().trim().toLowerCase();


        while(chances != 0){
            if (answer.contains("piano")) {
                System.out.println("Correct! You may proceed.");
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
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀");
        System.out.println("⣿⣿⣿⣿ FR?First Rooms?⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
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
        return false;
    }
}
