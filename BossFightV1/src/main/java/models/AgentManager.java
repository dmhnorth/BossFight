package models;

/**
 * Created by David on 21/10/2014.
 */
public class AgentManager {

    private Agent userAgent;

    private Agent[] agents;


    public Agent getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(Agent userAgent) {
        this.userAgent = userAgent;
    }
}
