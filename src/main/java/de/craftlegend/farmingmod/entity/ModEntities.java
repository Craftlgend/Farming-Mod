package de.craftlegend.farmingmod.entity;

import de.craftlegend.farmingmod.FarmingMod;
import de.craftlegend.farmingmod.entity.custom.PorcupineEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FarmingMod.MOD_ID, "porcupine"),
            EntityType.Builder.create(PorcupineEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 1f).build());

}
