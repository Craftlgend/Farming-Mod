package de.craftlegend.farmingmod.util;

import de.craftlegend.farmingmod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.LootTableGenerator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.function.SetStewEffectLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

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