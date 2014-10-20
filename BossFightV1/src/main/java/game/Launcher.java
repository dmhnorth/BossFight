package game;

import console.Console;
import console.textAdventure.TextAdventureConsole;

public class Launcher {


    public static void main(String[] args) {
        Console console = new TextAdventureConsole();
        console.startConsole();
    }

}
