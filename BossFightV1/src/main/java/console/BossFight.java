package console;

import models.AgentManager;
import rulebooks.GameRulebook;

/**
 * A console for playing a BossFight.
 */
public interface BossFight {

    void startBossFight();

    void setGameRulebook(GameRulebook gameRulebook);

    void setAgentManager(AgentManager agentManager);
}
