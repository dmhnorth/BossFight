package consoles.interfaces;

import consoles.textAdventure.TextAdventureAgentManager;
import rulebooks.Rulebook;

/**
 * AgentTypes console for playing a BossFightConsole.
 */
public interface BossFightConsole {

    void startBossFight();

    void setRulebook(Rulebook rulebook);

    void setTextAdventureAgentManager(TextAdventureAgentManager textAdventureAgentManager);
}
