package factories;

import models.Agent;
import rulebooks.GameRulebook;

public class AgentFactory {

    private GameRulebook gameRulebook;

    public AgentFactory(GameRulebook gameRulebook){
        this.gameRulebook = gameRulebook;
    }

    public Agent getAgent(String name) {
        Agent agent = new Agent(name);

        agent.setMaxHP(gameRulebook.getInitialPlayerMaxHealth());
        agent.setAttack(gameRulebook.getInitialPlayerAttack());
        agent.setDefence(gameRulebook.getInitialPlayerDefence());

        agent.restoreHP();

        return agent;
    }
}
