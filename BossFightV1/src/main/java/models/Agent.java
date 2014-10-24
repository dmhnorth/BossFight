package models;

public class Agent {

    private String name;
    private int currentHP;
    private int maxHP;
    private int defence;
    private int attack;
    private int level;

    public Agent(String name, int level) {
        setName(name);
        setLevel(level);
    }

    public void restoreHP() {
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

    public void setMaxHP(int maxHP) {
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

    public void setDefence(int defence) {
        this.defence = defence;
    }

    int getDefence() {
        return defence;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    int getAttack() {
        return attack;
    }

    boolean takeDamage(int damage) {
        currentHP = currentHP - damage;
        return isDead();
    }

    private Boolean isDead() {
        return currentHP <= 0;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Level:" + level + " HP:" + getCurrentHP() + "/" + getMaxHP() + " A:" + getAttack() + " D:" + getDefence();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}