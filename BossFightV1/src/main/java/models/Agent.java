package models;

import rulebooks.GameRulebook;

public class Agent {

    private String name;
    private int currentHP;
    private int maxHP;
    private int defence;
    private int attack;

    public Agent(String name, GameRulebook gameRulebook) {
        setName(name);

        setMaxHP(gameRulebook.getInitialPlayerMaxHealth());
        setAttack(gameRulebook.getInitialPlayerAttack());
        setDefence(gameRulebook.getInitialPlayerDefence());

        restoreHP();
    }

    private void restoreHP() {
        currentHP = maxHP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    int getCurrentHP() {
        return currentHP;
    }

    void setMaxHP(int maxHP) {
        if(maxHP > currentHP) {
            this.maxHP = maxHP;
            restoreHP();
        } else {
            currentHP = maxHP;
        }
    }

    int getMaxHP() {
        return maxHP;
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
        return "Name: " + getName() + " HP:" + getCurrentHP() + "/" + getMaxHP() + " A:" + getAttack() + " D:" + getDefence();
    }
}