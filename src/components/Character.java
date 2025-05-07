package components;

public abstract class Character {
    protected String name;
    public int life = 3;

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
    public void loseLife() {
        life--;
        System.out.println(name + " lost a life! Lives remaining: " + life);
    }
}
