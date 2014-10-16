package console;

/**
 * A console for playing the BossFight system
 */
public interface Console {

    void startConsole();

    void ShutdownConsole();

    void resetConsole();

    void setPersistentDataManager();

    void setView();

    void setGame();
}
