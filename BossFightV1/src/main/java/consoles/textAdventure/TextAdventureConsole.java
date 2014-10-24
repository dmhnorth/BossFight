package consoles.textAdventure;

import consoles.interfaces.BossFightConsole;
import consoles.interfaces.BossFightView;
import factories.AgentFactory;
import models.AgentManager;
import rulebooks.BasicRulebook;
import rulebooks.Rulebook;

import java.util.Scanner;

public class TextAdventureConsole implements BossFightConsole {

    private BossFightView view = new TextAdventureView();
    private Scanner scanner = new Scanner(System.in);
    private AgentManager agentManager;
    private Rulebook rulebook;
    private AgentFactory agentFactory;


    @Override
    public void startBossFight() {
        view.welcomeMessage();
        view.introduction();

        setAgentManager(new AgentManager());
        setRulebook(new BasicRulebook());
        agentFactory = new AgentFactory(rulebook);


        agentManager.setAgentPlayer1(agentFactory.getAgentAndSetName(scanner.next(), 1));

        System.out.println(agentManager.getAgentPlayer1().toString());


        //TODO make the rest of the text adventure version here

    }

    @Override
    public void setRulebook(Rulebook rulebook) {
        this.rulebook = rulebook;
    }

    @Override
    public void setAgentManager(AgentManager agentManager) {
        this.agentManager = agentManager;
    }
}
