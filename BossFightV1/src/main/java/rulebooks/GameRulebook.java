package rulebooks;

public interface GameRulebook {

    /**
     * Set the rules to construct the game in here.
     */
    void setRules();

    public int getInitialPlayerMaxHealth();

    public int getInitialPlayerAttack();

    public int getInitialPlayerDefence();
}
