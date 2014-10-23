package consoles.textAdventure;

import consoles.BossFightConsole;
import consoles.BossFightView;
import models.Agent;
import models.AgentController;
import rulebooks.BasicRulebook;
import rulebooks.Rulebook;

import java.util.Scanner;

public class TextAdventureConsole implements BossFightConsole {

    private BossFightView view = new TextAdventureView();
    private Scanner scanner = new Scanner(System.in);
    private AgentController agentController;
    private Rulebook rulebook;


    @Override
    public void startBossFight() {
        view.welcomeMessage();
        view.introduction();

        setAgentController(new AgentController());
        setRulebook(new BasicRulebook());

        agentController.setAgentPlayer1(new Agent(scanner.next()));

        System.out.println(agentController.getAgentPlayer1().toString());


        //TODO make the rest of the text adventure version here

    }

    @Override
    public void setRulebook(Rulebook rulebook) {
        this.rulebook = rulebook;
    }

    @Override
    public void setAgentController(AgentController agentController) {
        this.agentController = agentController;
    }
}
