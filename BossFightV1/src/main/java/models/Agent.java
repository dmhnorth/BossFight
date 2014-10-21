package models;

public class Agent {

    private String name;

    public Agent(String name) {
        setName(name);
    }

    boolean isNPC() {
        return false;
    }

    int getHealth() {
        return 0;
    }

    void setMaxHealth(int health) {

    }

    int getMaxHealth() {
        return 0;
    }

    void setDefence(int defence) {

    }

    int getDefence() {
        return 0;
    }

    void setAttack(int attack) {

    }

    int getAttack() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}