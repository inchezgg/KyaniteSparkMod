package kyanitespark.content;

import arc.graphics.*;
import mindustry.type.*;
import mindustry.content.Items;

public class KsItems {
    public static Item kyanite, processedKyanite;

    public static void load(){
        kyanite = new Item("kyanite", Color.valueOf("4c4379")){{
            hardness = 0;
            alwaysUnlocked = true;
        }};

        processedKyanite = new Item("processed-kyanite", Color.valueOf("4c4379")) {{
            alwaysUnlocked = true;
        }};

        Items.serpuloItems.addAll(kyanite, processedKyanite);

    }
}