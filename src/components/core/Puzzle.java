package components.core;

import java.util.Scanner;

public abstract class Puzzle {
    protected String name;
    protected Scanner scanner = new Scanner(System.in);
    public abstract boolean play();
}
