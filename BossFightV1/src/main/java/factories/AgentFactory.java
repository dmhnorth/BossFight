package factories;

import generators.NameGenerator;
import generators.NameGeneratorSimple;
import models.Agent;
import rulebooks.Rulebook;

public class AgentFactory {

    private Rulebook rulebook;
    private NameGenerator nameGenerator;

    public AgentFactory(Rulebook rulebook){
        this.rulebook = rulebook;
        this.nameGenerator = new NameGeneratorSimple();
    }

    public Agent getAgentAndSetNameAndLevel(String name, int level) {
        Agent agent = new Agent(name, level);

        agent.setMaxHP(rulebook.getMaxHealthViaLevel(level));
        agent.setAttack(rulebook.getAttackViaLevel(level));
        agent.setDefence(rulebook.getDefenceViaLevel(level));

        agent.restoreHP();

        System.out.println("Generated: " + agent);
        return agent;
    }

    public Agent getAgentWithRandomName(int level) {

        Agent agent = new Agent(nameGenerator.getUniqueName(), level);

        agent.setMaxHP(rulebook.getMaxHealthViaLevel(level));
        agent.setAttack(rulebook.getAttackViaLevel(level));
        agent.setDefence(rulebook.getDefenceViaLevel(level));

        agent.restoreHP();

        System.out.println("Generated: " + agent);
        return agent;
    }
}
