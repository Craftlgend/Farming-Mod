package de.craftlegend.farmingmod.block;

import de.craftlegend.farmingmod.FarmingMod;
import de.craftlegend.farmingmod.block.custom.SoundBlock;
import de.craftlegend.farmingmod.block.custom.TomatoCropBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(SoundBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), Block.Settings.copy(Blocks.IRON_BLOCK)));
    //region variants
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(BlockSetType.IRON, 10,  Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(Block.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(BlockSetType.IRON, Block.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, Block.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));
    //endregion

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(FarmingMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(Block.Settings.copy(Blocks.WHEAT)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FarmingMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(FarmingMod.MOD_ID, name), 
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        FarmingMod.LOGGER.info("Registering ModBlocks for "+FarmingMod.MOD_ID);
    }
}
