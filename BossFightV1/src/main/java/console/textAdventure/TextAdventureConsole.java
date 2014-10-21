package console.textAdventure;

import console.Console;
import models.Agent;
import models.AgentManager;
import rulebooks.BasicRulebook;
import rulebooks.GameRulebook;

import java.util.Scanner;

public class TextAdventureConsole implements Console {

    private TextAdventureView view = new TextAdventureView();
    private Scanner scanner = new Scanner(System.in);
    private AgentManager agentManager;
    private GameRulebook gameRulebook;


    @Override
    public void startConsole() {
        view.welcomeMessage();

        view.introduction();

        setAgentManager(new AgentManager());
        setGameRulebook(new BasicRulebook());

        agentManager.setAgentPlayer1(new Agent(scanner.next(), true, gameRulebook));

        System.out.println(agentManager.getAgentPlayer1().toString());


        //TODO make the rest of the text adventure version here

    }

    @Override
    public void setGameRulebook(GameRulebook gameRulebook) {
        this.gameRulebook = gameRulebook;
    }

    @Override
    public void ShutdownConsole() {
        view.shutdown();
    }

    @Override
    public void resetConsole() {
        view.reset();

    }

    @Override
    public void setAgentManager(AgentManager agentManager) {
        this.agentManager = agentManager;
    }
}
