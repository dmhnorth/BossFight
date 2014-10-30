package consoles.textAdventure;

import consoles.interfaces.BossFightConsole;
import consoles.interfaces.BossFightView;
import factories.AgentFactory;
import rulebooks.BasicRulebook;
import rulebooks.Rulebook;

import java.util.Scanner;

public class TextAdventureConsole implements BossFightConsole {

    private BossFightView view = new TextAdventureView();
    private Scanner scanner = new Scanner(System.in);
    private TextAdventureAgentManager textAdventureAgentManager;
    private Rulebook rulebook;
    private AgentFactory agentFactory;
    private Arena arena;


    @Override
    public void startBossFight() {
        view.welcomeMessage();
        view.introduction();

        setTextAdventureAgentManager(new TextAdventureAgentManager());
        setRulebook(new BasicRulebook());
        agentFactory = new AgentFactory(rulebook);


        textAdventureAgentManager.setAgentPlayer1(agentFactory.getAgentAndSetNameAndLevel(scanner.next(), 1));
        System.out.println(textAdventureAgentManager.getAgentPlayer1().toString());

        arena.startOneVsOneFight(textAdventureAgentManager.getAgentPlayer1(), agentFactory.getAgentWithRandomName(1));
//        arena.startOneVsOneFight(agentFactory.getAgentWithRandomName(1), agentFactory.getAgentWithRandomName(1));

        //TODO make the rest of the text adventure version here

    }

    @Override
    public void setRulebook(Rulebook rulebook) {
        this.rulebook = rulebook;
    }

    @Override
    public void setTextAdventureAgentManager(TextAdventureAgentManager textAdventureAgentManager) {
        this.textAdventureAgentManager = textAdventureAgentManager;
    }
}
