package kyanitespark;

import kyanitespark.content.*;
import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class KyaniteSparkMod extends Mod{

    public KyaniteSparkMod(){
        Log.info("Loaded KyaniteSparkMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup

        });
    }
    @Override
    public void loadContent(){
        Log.info("Loading KS content.");

        loadAllContent();

        Log.info("Kyanite Spark Mod initialized successfully :D");
    }

    private void loadAllContent(){

        KsItems.load();
        KsBlocks.load();
        Log.info("Loading content complete!");
    }

}
