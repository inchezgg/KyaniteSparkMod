package kyanitespark.content;



import mindustry.content.Items;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.environment.OreBlock;
//import mindustry.world.*;
//import mindustry.world.blocks.campaign.*;
//import mindustry.world.blocks.defense.*;
//import mindustry.world.blocks.defense.turrets.*;
//import mindustry.world.blocks.distribution.*;
//import mindustry.world.blocks.environment.*;
//import mindustry.world.blocks.liquid.*;
//import mindustry.world.blocks.logic.*;
//import mindustry.world.blocks.power.*;
//import mindustry.world.blocks.production.*;
//import mindustry.world.blocks.storage.*;
//import mindustry.world.blocks.units.*;
//import mindustry.world.consumers.*;
//import mindustry.world.draw.*;
//import mindustry.world.meta.*;

import static mindustry.type.ItemStack.with;

public class KsBlocks {
    public static Block
    //defense
    kyaniteWall,
    // ore
    oreKyanite;

    public static void load(){
        kyaniteWall = new Wall("kyanite-wall") {{
            health = 1000;
            requirements(Category.defense, with(KsItems.kyanite, 2));

        }};
        oreKyanite = new OreBlock("kyanite", KsItems.kyanite) {{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};
    }
}
