package console;

import models.AgentManager;
import rulebooks.GameRulebook;

/**
 * A console for playing the BossFight system
 */
public interface Console {

    void startConsole();

    void setGameRulebook(GameRulebook gameRulebook);

    void ShutdownConsole();

    void resetConsole();

    void setAgentManager(AgentManager agentManager);
}
