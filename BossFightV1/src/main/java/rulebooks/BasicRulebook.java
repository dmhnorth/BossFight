package rulebooks;

public class BasicRulebook implements Rulebook {
    private int initialPlayerMaxHealth;
    private int initialPlayerAttack;
    private int initialPlayerDefence;

    public BasicRulebook(){
        setRules();
    }

    @Override
    public void setRules() {
        initialPlayerMaxHealth = 50;
        initialPlayerAttack = 10;
        initialPlayerDefence = 5;
    }

    @Override
    public int getMaxHealthViaLevel(int level) {
        return initialPlayerMaxHealth * level;
    }

    @Override
    public int getAttackViaLevel(int level) {
        return initialPlayerAttack * level;
    }

    @Override
    public int getDefenceViaLevel(int level) {
        return initialPlayerDefence * level;
    }

}
