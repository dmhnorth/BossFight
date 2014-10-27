package consoles.textAdventure;

import factories.AgentFactory;
import models.Agent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rulebooks.BasicRulebook;
import rulebooks.Rulebook;

import static org.junit.Assert.assertEquals;


public class FightTest {
    Agent p1;
    Agent p2;

    @Before
    public void setUp() throws Exception {
        Rulebook rulebook = new BasicRulebook();
        AgentFactory agentFactory = new AgentFactory(rulebook);
        p1 = agentFactory.getAgentAndSetNameAndLevel("p1", 1);
        p2 = agentFactory.getAgentAndSetNameAndLevel("p2", 1);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStartFight() throws Exception {
        Fight fight = new Fight();
        Agent result = fight.startFight(p1, p2);
        System.out.println("Winner:" + result.getName() + " CurrentHP: " + result.getCurrentHP());
        assertEquals(p1, result);
    }



}