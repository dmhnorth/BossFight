package factories;

import models.Agent;

public interface AgentFactory {
    Agent getAgentAndSetNameAndLevel(String name, int level);

    Agent getAgentWithRandomName(int level);
}
