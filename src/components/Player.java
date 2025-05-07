package components;

public class Player extends Character {
    public Player(String name) {
        super(name, 3); // Example health & intelligence
    }

    @Override
    public void interact() {
        System.out.println("Hello, " + name + "! Let's escape!");
    }
}
