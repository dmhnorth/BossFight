package console;

public class TextConsole implements Console {

    TextAdventureView view = new TextAdventureView();
    private DataManager dataManager;


    @Override
    public void startConsole() {
        view.displayWelcomeMessage();
        dataManager.load();

        //TODO make the rest of the text adventure version here

    }

    @Override
    public void ShutdownConsole() {
        dataManager.save();
        view.shutdown();
    }

    @Override
    public void resetConsole() {
        view.reset();
        view = new TextAdventureView();
    }

    @Override
    public void setPersistentDataManager() {
//        dataManager = new DataManager();
    }
}
