package models;

public interface Agent {

    boolean isNPC();

    int getHealth();

    void setMaxHealth(int health);

    int getMaxHealth();

    void setDefence(int defence);

    int getDefence();

    void setAttack(int attack);

    int getAttack();

}