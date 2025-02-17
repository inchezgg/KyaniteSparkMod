package kyanitespark.content;



import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.environment.StaticWall;
import mindustry.world.blocks.production.Drill;
import mindustry.world.blocks.production.GenericCrafter;
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
    oreKyanite,
    // Kiln
    kyaniteKiln,
    // Drils
    kyaniteDrill;

    public static void load(){

        kyaniteWall = new Wall("kyanite-wall") {{
            health = 1000;
            destructible = true;
            requirements(Category.defense, with(KsItems.kyanite, 2));

        }};

        oreKyanite = new OreBlock("kyanite", KsItems.kyanite) {{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};

        kyaniteKiln = new GenericCrafter("kyanite-smelter"){{
            requirements(Category.crafting,
                with(Items.copper, 35,
                        Items.lead, 25,
                        Items.silicon, 15,
                        Items.titanium, 10));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(KsItems.processedKyanite, 1);
            craftTime = 30f;
            size = 2;
            hasPower = hasItems = true;

            consumeItems(with(KsItems.kyanite, 1, Items.coal, 3));
            consumePower(1f);
        }};

        kyaniteDrill = new Drill("kyanite-drill"){{
            requirements(Category.production,
                with(Items.copper, 65,
                        Items.lead, 35,
                        Items.titanium, 20,
                        KsItems.processedKyanite, 15));
            size = 3;
            health = 200;
            hasPower = true;
            tier = 5;
            drillTime = 128;
            rotateSpeed = 5f;


            consumePower(1.67f);
            consumeLiquid(Liquids.water, 0.3f).boost();

        }};
    }
}
