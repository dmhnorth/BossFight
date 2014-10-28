package consoles.textAdventure;

import models.Agent;

import java.util.Scanner;

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

        determineAction(attacker, defender);

        if(defender.isDead()) {
            return attacker;
        }

        return startOneVsOneFight(defender, attacker);
    }

    private void determineAction(Agent attacker, Agent defender) {


        System.out.print("Choose an action: ");
        //TODO make this a manual choice of the user
        //Attack the defender
        int actionChosen = 1;

        System.out.println(attacker.getName() + " chose " +  actionChosen);

        switch (actionChosen){
            case 1: defender.takeDamage(attacker.getAttack() - defender.getDefence());
                break;
            default: //Do nothing
        }
    }


    public void startOneVsManyFight(Agent attacker, Agent[] enemies) {
        for (Agent x : enemies){
            startOneVsOneFight(attacker, x);
        }
    }
}
