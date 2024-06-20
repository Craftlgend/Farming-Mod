package de.craftlegend.farmingmod.datagen;

import java.util.concurrent.CompletableFuture;

import de.craftlegend.farmingmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class ModLootTableProvider extends FabricBlockLootTableProvider{


    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);
        
    }

}
