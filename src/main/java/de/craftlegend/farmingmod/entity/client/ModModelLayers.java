package de.craftlegend.farmingmod.entity.client;

import de.craftlegend.farmingmod.FarmingMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(FarmingMod.MOD_ID, "porcupine"), "main");
}
