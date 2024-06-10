package de.craftlegend.farmingmod.datagen;

import java.util.concurrent.CompletableFuture;

import de.craftlegend.farmingmod.block.ModBlocks;
import de.craftlegend.farmingmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
            .add(ModBlocks.RUBY_BLOCK)
            .forceAddTag(BlockTags.GOLD_ORES)
            .forceAddTag(BlockTags.EMERALD_ORES)
            .forceAddTag(BlockTags.IRON_ORES)
            .forceAddTag(BlockTags.REDSTONE_ORES)
            .forceAddTag(BlockTags.LAPIS_ORES)
            .forceAddTag(BlockTags.DIAMOND_ORES)
            .forceAddTag(BlockTags.COPPER_ORES)
            .forceAddTag(BlockTags.COAL_ORES);

        
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.RUBY_BLOCK)
            .add(ModBlocks.SOUND_BLOCK);

        
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        

    }

}
