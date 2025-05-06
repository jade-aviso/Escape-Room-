package components.rooms;

import java.util.Scanner;
import Puzzle;

public class room1 extends Puzzle {

    private final String correctCode;

    public room1(String hint, String code) {
        super(hint);
        this.correctCode = code;
    }

    @Override
    public void displayHint() {
        System.out.println("Room 1 - Lock Puzzle\nHint: " + hint);
    }

    @Override
    public boolean attemptSolve(String answer) {
        if (answer.equals(correctCode)) {
            isSolved = true;
            System.out.println("✅ Correct! Lock opened.");
            return true;
        } else {
            System.out.println("❌ Incorrect.");
            return false;
        }
    }
}
