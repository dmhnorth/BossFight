package console.textAdventure;

/**
 * English language - Text adventure format.
 */
public class TextAdventureView {

    void displayWelcomeMessage() {
        System.out.println("Hello, welcome to the launchers.");
    }

    public void reset() {
        System.err.println("Console has been reset.");
    }

    public void shutdown() {
        System.out.println("The system will attempt to save and shutdown.");
    }
}
