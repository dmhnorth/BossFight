package launchers;

import console.Console;
import console.textAdventure.TextAdventureConsole;

public class TextAdventureLauncher {


    public static void main(String[] args) {
        Console console = new TextAdventureConsole();
        console.startConsole();
    }

}
