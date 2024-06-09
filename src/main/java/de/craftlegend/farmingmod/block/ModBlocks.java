package de.craftlegend.farmingmod.block;

import de.craftlegend.farmingmod.FarmingMod;
import de.craftlegend.farmingmod.block.custom.SoundBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block", new SoundBlock(SoundBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FarmingMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(FarmingMod.MOD_ID, name), 
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        FarmingMod.LOGGER.info("Registering ModBlocks for"+FarmingMod.MOD_ID);   
    }
}
