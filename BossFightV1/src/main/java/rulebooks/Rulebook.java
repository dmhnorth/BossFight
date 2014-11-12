package rulebooks;

public class Rulebook {

    public int getMaxHealthViaLevel(int level) {
        int initialPlayerMaxHealth = 50;
        return initialPlayerMaxHealth * level;
    }

    public int getAttackViaLevel(int level) {
        int initialPlayerAttack = 10;
        return initialPlayerAttack * level;
    }

    public int getDefenceViaLevel(int level) {
        int initialPlayerDefence = 5;
        return initialPlayerDefence * level;
    }

}
