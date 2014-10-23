package consoles;

import models.AgentController;
import rulebooks.Rulebook;

/**
 * AgentTypes console for playing a BossFightConsole.
 */
public interface BossFightConsole {

    void startBossFight();

    void setRulebook(Rulebook rulebook);

    void setAgentController(AgentController agentController);
}
