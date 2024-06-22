package de.craftlegend.farmingmod.item;


import de.craftlegend.farmingmod.FarmingMod;
import de.craftlegend.farmingmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new Item.Settings().maxDamage(64)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new Item.Settings()));
    public static final Item RUBY_STAFF = registerItem("ruby_staff", new Item(new Item.Settings().maxCount(1)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY,new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 2, 2f))));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY,new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 3, 1f))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY,new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.RUBY, 0, 0f))));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUBY, 5, 3f))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.RUBY, 0, 0f))));




    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FarmingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FarmingMod.LOGGER.info("Registering Mod Items for" + FarmingMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
