package consoles.textAdventure;

import consoles.interfaces.BossFightView;

/**
 * English language - Text adventure format.
 */
public class TextAdventureView implements BossFightView {

    @Override
    public void welcomeMessage() {
        System.out.println("Hello, welcome to the launchers.");
    }

    @Override
    public void introduction() {
        System.out.println("Welcome to a 'BossFightConsole', please give your player a name: ");
    }
}
