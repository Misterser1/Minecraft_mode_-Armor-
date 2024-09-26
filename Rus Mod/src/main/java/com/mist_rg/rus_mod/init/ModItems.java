package com.mist_rg.rus_mod.init;

import com.mist_rg.rus_mod.RusMod;
import com.mist_rg.rus_mod.items.MaterialItem;
import com.mist_rg.rus_mod.items.RedMageArmorItem;
import com.mist_rg.rus_mod.items.RedMageArmorMaterial;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RusMod.MOD_ID);

    public static final RegistryObject<Item> RED_MAGE_HELMET = ITEMS.register("red_mage_helmet", () ->
            new RedMageArmorItem(RedMageArmorMaterial.RED_MAGE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> RED_MAGE_CHESTPLATE = ITEMS.register("red_mage_chestplate", () ->
            new RedMageArmorItem(RedMageArmorMaterial.RED_MAGE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> RED_MAGE_LEGGINGS = ITEMS.register("red_mage_leggings", () ->
            new RedMageArmorItem(RedMageArmorMaterial.RED_MAGE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> RED_MAGE_BOOTS = ITEMS.register("red_mage_boots", () ->
            new RedMageArmorItem(RedMageArmorMaterial.RED_MAGE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> KIWI = ITEMS.register("kiwi", MaterialItem::new);
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", MaterialItem::new);
}
