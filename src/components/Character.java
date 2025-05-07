package components;

public abstract class Character {
    protected String name;
    protected int health;
    protected int intelligence;

    public Character(String name, int health, int intelligence) {
        this.name = name;
        this.health = health;
        this.intelligence = intelligence;
    }

    // Abstract method to be implemented by subclasses
    public abstract void interact();

    // Common methods
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        health += amount;
    }

    public void boostIntelligence(int amount) {
        intelligence += amount;
    }

    @Override
    public String toString() {
        return name + " | Health: " + health + " | Intelligence: " + intelligence;
    }
}
