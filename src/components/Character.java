package components;

public abstract class Character {
    protected String name;
    protected int life;

    public Character(String name, int life) {
        this.name = name;
        this.life = life;
    }

    // Abstract method to be implemented by subclasses
    public abstract void interact();

    // Common methods
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String toString() {
        return name + " | Lives: " + life;
    }
}
