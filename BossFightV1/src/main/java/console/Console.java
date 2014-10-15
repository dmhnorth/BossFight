package console;

/**
 * A console for playing the BossFight system
 */
public interface Console {

    /**
     * to begin playing the game
     */
    void startConsole();

    /**
     * close down the console
     */
    void closeConsole();

    /**
     * reset the console completely
     */
    void resetConsole();

    /**
     * set the manager for persistence
     */
    void setDataManager();

    /**
     * set the console View
     */
    void setView();

    /**
     * set the console game
     */
    void setGame();

}
