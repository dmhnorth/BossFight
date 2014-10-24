package rulebooks;

public interface Rulebook {

    /**
     * Set the rules to construct the game in here.
     */
    void setRules();

    public int getMaxHealthViaLevel(int level);

    public int getAttackViaLevel(int level);

    public int getDefenceViaLevel(int level);
}
