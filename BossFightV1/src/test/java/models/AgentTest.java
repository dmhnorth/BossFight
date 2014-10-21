package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rulebooks.BasicRulebook;
import rulebooks.GameRulebook;
import sun.management.resources.agent;

import static org.junit.Assert.*;

public class AgentTest {
    Agent agent;
    String name;
    GameRulebook gameRulebook;

    @Before
    public void setUp() throws Exception {
        name = "Dave";
        gameRulebook = new BasicRulebook();
        agent = new Agent(name, gameRulebook);
    }

    @After
    public void tearDown() throws Exception {
        name = null;
        agent = null;
        gameRulebook = null;
    }

    @Test
    public void testSetName() throws Exception {
        String secondName = "dave";
        agent.setName(secondName);
        assertEquals(secondName, agent.getName());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals(name, agent.getName());
    }

    @Test
    public void testCurrentHPSetAccurately() throws Exception {
        assertEquals(agent.getCurrentHP(), gameRulebook.getInitialPlayerMaxHealth());
    }

    @Test
    public void testSetAndGetMaxHP() throws Exception {
        int value = 160;
        agent.setMaxHP(value);
        assertTrue(agent.getMaxHP() == value);
    }

    @Test
    public void testSetAndGetDefence() throws Exception {
        int value = 160;
        agent.setDefence(value);
        assertTrue(agent.getDefence() == value);
    }

    @Test
    public void testSetAndGetAttack() throws Exception {
        int value = 160;
        agent.setDefence(value);
        assertTrue(agent.getDefence() == value);
    }

    @Test
    public void testToString() throws Exception {
        //Visual test only
        System.out.println(agent.toString());
    }

    @Test
    public void testCurrentHPDoesNotExceedMaxHP(){
        agent.setMaxHP(10);
        assertTrue(agent.getCurrentHP() < agent.getMaxHP());
    }
}