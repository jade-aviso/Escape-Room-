package components.rooms;

import java.util.Scanner;
import components.Puzzle;

public class room3 extends Puzzle {

    private final String correctWord;

    public room3(String hint, String word) {
        super(hint);
        this.correctWord = word.toLowerCase();
    }

    @Override
    public void displayHint() {
        System.out.println("Room 3 - Word Puzzle\nHint: " + hint);
    }

    @Override
    public boolean attemptSolve(String answer) {
        if (answer.toLowerCase().equals(correctWord)) {
            isSolved = true;
            System.out.println("✅ Correct! Word matched.");
            return true;
        } else {
            System.out.println("❌ Incorrect word.");
            return false;
        }
    }
}
