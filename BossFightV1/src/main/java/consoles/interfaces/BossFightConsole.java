package consoles.interfaces;

import models.AgentManager;
import rulebooks.Rulebook;

/**
 * AgentTypes console for playing a BossFightConsole.
 */
public interface BossFightConsole {

    void startBossFight();

    void setRulebook(Rulebook rulebook);

    void setAgentManager(AgentManager agentManager);
}
