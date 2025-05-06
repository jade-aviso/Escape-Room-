import components.rooms.Room1;
import components.rooms.Room2;
import components.rooms.Room3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Escape Room Game!");

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
}
