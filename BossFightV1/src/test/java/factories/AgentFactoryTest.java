package factories;

import models.Agent;
import org.junit.Before;
import org.junit.Test;
import rulebooks.BasicRulebook;
import rulebooks.Rulebook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AgentFactoryTest {
    AgentFactory agentFactory;

    @Before
    public void setUp() throws Exception {
        Rulebook rulebook = new BasicRulebook();
        agentFactory = new AgentFactory(rulebook);


    }

    @Test
    public void testGetAgentAndSetNameAndLevel() throws Exception {
        String name = "Dave";
        Agent agent = agentFactory.getAgentAndSetNameAndLevel(name, 1);
        System.out.println(agent.toString());
        assertEquals(agent.getName(), name);

    }

    @Test
    public void testGetAgentWithRandomName() throws Exception {
        Agent agent = agentFactory.getAgentWithRandomName(1);
        System.out.println(agent.toString());
        assertNotNull(agent);
    }
}