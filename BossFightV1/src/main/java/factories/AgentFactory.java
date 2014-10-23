package factories;

import models.Agent;
import rulebooks.Rulebook;

public class AgentFactory {

    private Rulebook rulebook;

    public AgentFactory(Rulebook rulebook){
        this.rulebook = rulebook;
    }

    public Agent getAgent(String name) {
        Agent agent = new Agent(name);

        agent.setMaxHP(rulebook.getInitialPlayerMaxHealth());
        agent.setAttack(rulebook.getInitialPlayerAttack());
        agent.setDefence(rulebook.getInitialPlayerDefence());

        agent.restoreHP();

        return agent;
    }
}
