import consoles.textAdventure.ArenaTest;
import factories.AgentFactoryTest;
import generators.NameGeneratorSimpleTest;
import models.AgentTest;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArenaTest.class, AgentTest.class, AgentFactoryTest.class, NameGeneratorSimpleTest.class, })
public class BossFightTestSuite {
    //nothing required here
}
