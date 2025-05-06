package components.rooms;

import java.util.Scanner;
import components.Puzzle;

public class room2 extends Puzzle {

    private final int correctAnswer;

    public room2(String hint, int answer) {
        super(hint);
        this.correctAnswer = answer;
    }

    @Override
    public void displayHint() {
        System.out.println("Room 2 - Math Puzzle\nHint: " + hint);
    }

    @Override
    public boolean attemptSolve(String input) {
        try {
            int userAnswer = Integer.parseInt(input);
            if (userAnswer == correctAnswer) {
                isSolved = true;
                System.out.println("✅ Correct! Math solved.");
                return true;
            } else {
                System.out.println("❌ Wrong answer.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            return false;
        }
    }
}
