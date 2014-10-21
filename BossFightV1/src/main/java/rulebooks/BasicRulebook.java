package rulebooks;

/**
 * Created by David on 21/10/2014.
 */
public class BasicRulebook implements GameRulebook {
    private int initialPlayerMaxHealth;
    private int initialPlayerAttack;
    private int initialPlayerDefence;

    public BasicRulebook(){
        setRules();
    }

    @Override
    public void setRules() {
        initialPlayerMaxHealth = 100;
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
