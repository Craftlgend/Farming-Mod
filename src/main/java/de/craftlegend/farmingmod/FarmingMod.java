package de.craftlegend.farmingmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.craftlegend.farmingmod.item.ModItemGroups;
import de.craftlegend.farmingmod.item.ModItems;

public class FarmingMod implements ModInitializer {
	public static final String MOD_ID = "farming-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}