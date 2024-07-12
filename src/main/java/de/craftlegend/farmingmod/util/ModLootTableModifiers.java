package de.craftlegend.farmingmod.util;

import de.craftlegend.farmingmod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableModifiers {



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {     // If the loot table is for the cobblestone block and it is not overridden by a user:
            if (LootTables.JUNGLE_TEMPLE_CHEST == key && source. isBuiltin()) {         // Create a new loot pool that will hold the diamonds.
                LootPool. Builder pool = LootPool. builder()             // Add diamonds...
                    .with(ItemEntry. builder(ModItems. RUBY)) ;            // ...only if the block would survive a potential explosion.
                    //.conditionally(SurvivesExplosionLootCondition. builder());          // Add the loot pool to the loot table
                tableBuilder. pool(pool);     }
            if (EntityType.CREEPER.getLootTableId() == key && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        .with(ItemEntry.builder(ModItems.RUBY));
                tableBuilder.pool(pool);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (LootTables.DESERT_PYRAMID_ARCHAEOLOGY == key && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        .bonusRolls(ConstantLootNumberProvider.create(1.0f))
                        .with((LootPoolEntry.Builder<?>) ItemEntry.builder(ModItems.RUBY));



                tableBuilder.pool(pool);
            }

        });
    }
}