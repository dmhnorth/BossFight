package console.textAdventure;

import console.Console;
import console.DataManager;

public class TextAdventureConsole implements Console {

    private TextAdventureView view = new TextAdventureView();
    private DataManager dataManager = new TextAdventureDataManager();

    @Override
    public void startConsole() {
        view.displayWelcomeMessage();
        dataManager.load();

        //TODO make the rest of the text adventure version here

    }

    @Override
    public void ShutdownConsole() {
        view.shutdown();
        dataManager.save();
    }

    @Override
    public void resetConsole() {
        view.reset();

    }
}
