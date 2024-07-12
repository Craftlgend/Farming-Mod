package de.craftlegend.farmingmod;

import de.craftlegend.farmingmod.util.ModCustomTrades;
import de.craftlegend.farmingmod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.craftlegend.farmingmod.block.ModBlocks;
import de.craftlegend.farmingmod.item.ModItemGroups;
import de.craftlegend.farmingmod.item.ModItems;

public class FarmingMod implements ModInitializer {
	public static final String MOD_ID = "farming-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 500);
	}
}