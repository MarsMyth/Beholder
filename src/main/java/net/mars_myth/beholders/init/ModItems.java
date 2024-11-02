package net.mars_myth.beholders.init;

import net.mars_myth.beholders.EyeOfTheBeholder;
import net.mars_myth.beholders.item.AncientOrbItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ANCIENT_ORB = registerItem("ancient_orb",
            new AncientOrbItem(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EyeOfTheBeholder.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EyeOfTheBeholder.LOGGER.info("Registering Mod Items for " + EyeOfTheBeholder.MOD_ID);
    }
}
