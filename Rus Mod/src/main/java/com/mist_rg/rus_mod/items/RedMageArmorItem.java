package com.mist_rg.rus_mod.items;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class RedMageArmorItem extends ArmorItem {
    public RedMageArmorItem(RedMageArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            return "rus_mod:textures/models/armor/red_mage_layer_2.png";
        } else {
            return "rus_mod:textures/models/armor/red_mage_layer_1.png";
        }
    }
}
