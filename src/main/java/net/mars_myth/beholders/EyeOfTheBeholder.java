package net.mars_myth.beholders;

import net.fabricmc.api.ModInitializer;

import net.mars_myth.beholders.init.ModBlocks;
import net.mars_myth.beholders.init.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EyeOfTheBeholder implements ModInitializer {
	public static final String MOD_ID = "beholders";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}