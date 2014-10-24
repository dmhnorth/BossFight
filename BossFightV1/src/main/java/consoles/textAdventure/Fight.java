package consoles.textAdventure;

import models.Agent;

public interface Fight {

    /**
     *
     * @return the winner
     */
    Agent startFight(Agent player, Agent enemy);
}
