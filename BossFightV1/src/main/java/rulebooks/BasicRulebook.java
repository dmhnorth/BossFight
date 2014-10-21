package rulebooks;

public class BasicRulebook implements GameRulebook {
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
    public int getInitialPlayerMaxHealth() {
        return initialPlayerMaxHealth;
    }

    @Override
    public int getInitialPlayerAttack() {
        return initialPlayerAttack;
    }

    @Override
    public int getInitialPlayerDefence() {
        return initialPlayerDefence;
    }
}
