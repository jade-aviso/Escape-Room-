

import components.Puzzle;
import components.rooms.room1;
import components.rooms.room2;
import components.rooms.room3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Puzzle[] rooms = new Puzzle[] {
            new room1("The year the Berlin Wall fell.", "1989"),
            new room2("What is 12 * 12?", 144),
            new room3("Unscramble this: 'tpcehao'", "cheatpo") // example fake word
        };

        for (int i = 0; i < rooms.length; i++) {
            System.out.println("\n--- Entering Room " + (i + 1) + " ---");
            Puzzle currentRoom = rooms[i];
            currentRoom.displayHint();

            while (!currentRoom.isSolved()) {
                System.out.print("Your answer: ");
                String input = scanner.nextLine();
                currentRoom.attemptSolve(input);
            }
        }

        System.out.println("\n🎉 Congratulations! You escaped all the rooms!");
    }
}
