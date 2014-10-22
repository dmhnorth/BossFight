package launchers;

import consoles.BossFightConsole;
import consoles.textAdventure.TextAdventureConsole;

public class TextAdventureLauncher {


    public static void main(String[] args) {
        BossFightConsole bossFightConsole = new TextAdventureConsole();
        bossFightConsole.startBossFight();
    }

}
