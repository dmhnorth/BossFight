package consoles;

import models.AgentManager;
import rulebooks.GameRulebook;

/**
 * AgentTypes console for playing a BossFightConsole.
 */
public interface BossFightConsole {

    void startBossFight();

    void setGameRulebook(GameRulebook gameRulebook);

    void setAgentManager(AgentManager agentManager);
}
