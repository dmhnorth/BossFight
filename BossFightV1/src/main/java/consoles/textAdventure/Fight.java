package consoles.textAdventure;

import models.Agent;

public class Fight {

    /**
     * @return the winner
     */
    Agent startFight(Agent player, Agent enemy) throws IllegalArgumentException {
        if(player.equals(enemy)) {
            throw new IllegalArgumentException(player.getName() + " cannot fight themselves");
        }

        if(player.isDead()){
            return enemy;
        }
        enemy.takeDamage(player.getAttack() - enemy.getDefence());

        if(enemy.isDead()) {
            return player;
        } else {
            startFight(enemy, player);
        }
        return player;
    }
}
