/**
 * A console for playing the BossFight system
 */
public interface Console {

    /**
     * to begin playing the game
     */
    void startUpConsole();

    /**
     * close down the console
     */
    void closeDownConsole();

    /**
     * reset the console completely
     */
    void resetConsole();

    /**
     * set the manager for persistence
     */
    void setDataManager();

}
