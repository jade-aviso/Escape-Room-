package src;

public abstract class Puzzle {
    protected String hint;
    protected boolean isSolved;

    public Puzzle(String hint) {
        this.hint = hint;
        this.isSolved = false;
    }

    public abstract void displayHint();
    public abstract boolean attemptSolve(String answer);

    public boolean isSolved() {
        return isSolved;
    }
}
