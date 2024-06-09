package de.craftlegend.farmingmod.item;

import de.craftlegend.farmingmod.FarmingMod;
import de.craftlegend.farmingmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FARMING_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FarmingMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.COAL_BRIQUETTE);
                    }).build());


    public static void registerItemGroups(){
        FarmingMod.LOGGER.info("Registering Item Groups for"+FarmingMod.MOD_ID);
    }
}
