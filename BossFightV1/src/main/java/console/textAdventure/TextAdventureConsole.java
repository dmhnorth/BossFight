package console.textAdventure;

import console.Console;
import console.DataManager;
import models.Agent;
import models.AgentManager;

import java.util.Scanner;

public class TextAdventureConsole implements Console {

    private TextAdventureView view = new TextAdventureView();
    private DataManager dataManager = new TextAdventureDataManager();
    private Scanner scanner = new Scanner(System.in);
    private AgentManager agentManager;


    @Override
    public void startConsole() {
        view.welcomeMessage();
        dataManager.load();

        view.introduction();
        agentManager = new AgentManager();
        agentManager.setAgentPlayer1(new Agent(scanner.next()));


        //TODO make the rest of the text adventure version here

    }

    @Override
    public void ShutdownConsole() {
        view.shutdown();
        dataManager.save();
    }

    @Override
    public void resetConsole() {
        view.reset();

    }
}
