package models;

public class Agent {


    private String name;
    private int health;
    private int maxHealth;
    private int defence;
    private int attack;
    private boolean isNPC;

    public Agent(String name, boolean isNPC) {
        setName(name);
        setNPC(isNPC);
    }

    boolean isNPC() {
        return isNPC;
    }

    public void setNPC(boolean isNPC) {
        this.isNPC = isNPC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }

    void setMaxHealth(int health) {
        this.health = health;
    }

    int getMaxHealth() {
        return maxHealth;
    }

    void setDefence(int defence) {
        this.defence = defence;
    }

    int getDefence() {
        return defence;
    }

    void setAttack(int attack) {
        this.attack = attack;
    }

    int getAttack() {
        return attack;
    }
}