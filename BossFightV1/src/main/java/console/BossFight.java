package console;

import models.AgentManager;
import rulebooks.GameRulebook;

/**
 * A console for playing a BossFight.
 */
public interface BossFight {

    void startBossFight();

    void setGameRulebook(GameRulebook gameRulebook);

    void ShutdownConsole();

    void resetConsole();

    void setAgentManager(AgentManager agentManager);
}
