package de.craftlegend.farmingmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class MetalDetectorItem extends Item{

    public MetalDetectorItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundblock = false;

            for(int i = 0; i <= positionClicked.getY() +64; i++){
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));

                if(isValuableBlock(state)) {
                    outputValuableCoordinates(positionClicked.down(i), player, state.getBlock());
                    foundblock = true;
                    break;
                }
            }

            if(!foundblock){
                player.sendMessage(Text.literal("No Valuables Found!"));
            }

        }

        context.getStack().damage(1, context.getPlayer(),
                EquipmentSlot.MAINHAND);


        return ActionResult.SUCCESS;
    }
    private void outputValuableCoordinates(BlockPos BlockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at (" + BlockPos.getX() + ", " + BlockPos.getY() + ", " + BlockPos.getZ() + ")"), false);
    }
    private boolean isValuableBlock(BlockState state) {
        return state.isOf(Blocks.IRON_ORE) || state.isOf(Blocks.DIAMOND_ORE);
    }
}
