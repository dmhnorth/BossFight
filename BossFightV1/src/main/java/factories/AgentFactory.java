package factories;

import generators.NameGenerator;
import models.Agent;
import rulebooks.Rulebook;

import java.util.logging.Level;

public class AgentFactory {

    private Rulebook rulebook;
    private NameGenerator nameGenerator;

    public AgentFactory(Rulebook rulebook){
        this.rulebook = rulebook;
    }

    public Agent getAgentAndSetNameAndLevel(String name, int level) {
        Agent agent = new Agent(name, level);

        agent.setMaxHP(rulebook.getMaxHealthViaLevel(level));
        agent.setAttack(rulebook.getAttackViaLevel(level));
        agent.setDefence(rulebook.getDefenceViaLevel(level));

        agent.restoreHP();

        return agent;
    }

    public Agent getAgentWithRandomName(int level) {

        Agent agent = new Agent(nameGenerator.getUniqueName(), level);

        agent.setMaxHP(rulebook.getMaxHealthViaLevel(level));
        agent.setAttack(rulebook.getAttackViaLevel(level));
        agent.setDefence(rulebook.getDefenceViaLevel(level));

        agent.restoreHP();

        return agent;
    }
}
