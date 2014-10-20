package console;

/**
 * English language - Text adventure format.
 */
public class TextAdventureView {

    void displayWelcomeMessage() {
        System.out.println("Hello, welcome to the game.");
    }

    public void reset() {
        System.err.println("Console has been reset.");
    }

    public void shutdown() {
        System.out.println("System has been shutdown.");
    }
}
