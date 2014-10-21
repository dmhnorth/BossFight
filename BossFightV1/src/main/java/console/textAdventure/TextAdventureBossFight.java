package console.textAdventure;

import console.BossFight;
import models.Agent;
import models.AgentManager;
import rulebooks.BasicRulebook;
import rulebooks.GameRulebook;

import java.util.Scanner;

public class TextAdventureBossFight implements BossFight {

    private TextAdventureView view = new TextAdventureView();
    private Scanner scanner = new Scanner(System.in);
    private AgentManager agentManager;
    private GameRulebook gameRulebook;


    @Override
    public void startBossFight() {
        view.welcomeMessage();

        view.introduction();

        setAgentManager(new AgentManager());
        setGameRulebook(new BasicRulebook());

        agentManager.setAgentPlayer1(new Agent(scanner.next(), gameRulebook));

        System.out.println(agentManager.getAgentPlayer1().toString());


        //TODO make the rest of the text adventure version here

    }

    @Override
    public void setGameRulebook(GameRulebook gameRulebook) {
        this.gameRulebook = gameRulebook;
    }

    @Override
    public void setAgentManager(AgentManager agentManager) {
        this.agentManager = agentManager;
    }
}
