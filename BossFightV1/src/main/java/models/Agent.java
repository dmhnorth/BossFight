package models;

import rulebooks.GameRulebook;

public class Agent {


    private String name;
    private int health;
    private int maxHealth;
    private int defence;
    private int attack;
    private boolean isNPC;

    public Agent(String name, boolean isNPC, GameRulebook gameRulebook) {
        setName(name);
        setNPC(isNPC);

        setMaxHealth(gameRulebook.getInitialPlayerMaxHealth());
        setAttack(gameRulebook.getInitialPlayerAttack());
        setDefence(gameRulebook.getInitialPlayerDefence());
    }

    //NPC = non-playable character
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

    @Override
    public String toString() {
        String space = " :: ";
        return getName() + space + isNPC() + space + getMaxHealth() + space + getAttack() + space + getDefence();
    }
}