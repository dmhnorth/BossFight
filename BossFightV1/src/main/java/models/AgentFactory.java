package models;

public class AgentFactory {



    void getAgent(AgentTypes agentClass){
        switch (agentClass) {
            case Wizard:
                System.out.println("I'm a wizard");
                System.out.println(AgentTypes.Wizard.getClass());
                break;
            case VillageIdiot:
                System.out.println("I am Dave North");
                System.out.println(AgentTypes.VillageIdiot.getClass());
                break;
            case King:
                System.out.println("I am the King");
                System.out.println(AgentTypes.King.getClass());
                break;
        }

    }

    public static void main(String[] args) {
        AgentFactory agentFactory = new AgentFactory();
        agentFactory.launch();
    }

    private void launch() {
        getAgent(AgentTypes.Wizard);
        getAgent(AgentTypes.VillageIdiot);
        getAgent(AgentTypes.King);
    }
}