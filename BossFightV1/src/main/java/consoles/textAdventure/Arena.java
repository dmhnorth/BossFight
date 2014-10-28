package consoles.textAdventure;

import models.Agent;

public class Arena {

    /**
     * @return the winner
     */
    Agent startOneVsOneFight(Agent attacker, Agent defender) throws IllegalArgumentException {
        if(attacker.equals(defender)) {
            throw new IllegalArgumentException(attacker.getName() + " cannot fight themselves");
        }

        if(attacker.isDead()){
            return defender;
        }
        defender.takeDamage(attacker.getAttack() - defender.getDefence());

        if(defender.isDead()) {
            return attacker;
        }

        return startOneVsOneFight(defender, attacker);
        }

    public void startOneVsManyFight(Agent attacker, Agent[] enemies) {
        for (Agent x : enemies){
            startOneVsOneFight(attacker, x);
        }
    }
}
