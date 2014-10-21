package launchers;

import console.BossFight;
import console.textAdventure.TextAdventureBossFight;

public class TextAdventureLauncher {


    public static void main(String[] args) {
        BossFight bossFight = new TextAdventureBossFight();
        bossFight.startBossFight();
    }

}
