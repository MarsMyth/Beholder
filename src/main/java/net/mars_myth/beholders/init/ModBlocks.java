package net.mars_myth.beholders.init;

import net.mars_myth.beholders.EyeOfTheBeholder;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {


    public static final Block DEACTIVATED_CRYSTAL = registerBlock("deactivated_crystal",
            new Block(AbstractBlock.Settings.copy(Blocks.BUDDING_AMETHYST)));

    public static final Block ACTIVATED_CRYSTAL = registerBlock("activated_crystal",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EyeOfTheBeholder.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(EyeOfTheBeholder.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        EyeOfTheBeholder.LOGGER.info("Registering ModBlocks for " + EyeOfTheBeholder.MOD_ID);
    }
}
