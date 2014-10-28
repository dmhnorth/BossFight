package consoles.textAdventure;

import factories.AgentFactory;
import models.Agent;
import org.junit.Before;
import org.junit.Test;
import rulebooks.BasicRulebook;
import rulebooks.Rulebook;

import static org.junit.Assert.assertEquals;


public class ArenaTest {
    Agent p1;
    Agent p2;
    Arena arena;

    @Before
    public void setUp() throws Exception {
        Rulebook rulebook = new BasicRulebook();
        AgentFactory agentFactory = new AgentFactory(rulebook);
        p1 = agentFactory.getAgentAndSetNameAndLevel("p1", 1);
        p2 = agentFactory.getAgentAndSetNameAndLevel("p2", 1);
        arena = new Arena();
    }

    @Test
    public void testStartFight() throws Exception {
        Agent result = arena.startOneVsOneFight(p1, p2);
        System.out.println("Winner:" + result.getName() + " CurrentHP: " + result.getCurrentHP());
        assertEquals(p1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDropDuplicateAgentInFightException() {
        arena.startOneVsOneFight(p1, p1);
    }
}



