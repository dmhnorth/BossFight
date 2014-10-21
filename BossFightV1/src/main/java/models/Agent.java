package models;

import rulebooks.GameRulebook;

public class Agent {


    private String name;
    private int health;
    private int maxHealth;
    private int defence;
    private int attack;
    private boolean isNPC;

    public Agent(String name, GameRulebook gameRulebook) {
        setName(name);

        setMaxHealth(gameRulebook.getInitialPlayerMaxHealth());
        setAttack(gameRulebook.getInitialPlayerAttack());
        setDefence(gameRulebook.getInitialPlayerDefence());

        restoreHealth();
    }

    private void restoreHealth() {
        health = maxHealth;
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

    void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
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
        return "Name: " + getName() + " Health:" + getHealth() + "/" + getMaxHealth() + " A:" + getAttack() + " D:" + getDefence();
    }
}