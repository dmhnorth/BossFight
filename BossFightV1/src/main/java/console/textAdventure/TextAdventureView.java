package console.textAdventure;

/**
 * English language - Text adventure format.
 */
public class TextAdventureView {

    void welcomeMessage() {
        System.out.println("Hello, welcome to the launchers.");
    }

    public void reset() {
        System.err.println("BossFight has been reset.");
    }

    public void shutdown() {
        System.out.println("The BossFight will attempt to save and shutdown.");
    }

    public void introduction() {
        System.out.println("Welcome to a BossFight, please give your player a name: ");
    }
}
