package factories;

import generators.NameGenerator;
import models.Agent;
import rulebooks.Rulebook;

public class AgentFactory {

    private Rulebook rulebook;
    private NameGenerator nameGenerator;

    public AgentFactory(Rulebook rulebook){
        this.rulebook = rulebook;
    }

    public Agent getAgentAndSetName(String name) {
        Agent agent = new Agent(name);

        agent.setMaxHP(rulebook.getInitialPlayerMaxHealth());
        agent.setAttack(rulebook.getInitialPlayerAttack());
        agent.setDefence(rulebook.getInitialPlayerDefence());

        agent.restoreHP();

        return agent;
    }

    public Agent getAgentWithRandomName() {

        Agent agent = new Agent(nameGenerator.getUniqueName());

        agent.setMaxHP(rulebook.getInitialPlayerMaxHealth());
        agent.setAttack(rulebook.getInitialPlayerAttack());
        agent.setDefence(rulebook.getInitialPlayerDefence());

        agent.restoreHP();

        return agent;
    }
}
