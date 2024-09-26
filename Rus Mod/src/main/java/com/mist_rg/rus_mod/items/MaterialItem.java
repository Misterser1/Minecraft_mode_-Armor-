package com.mist_rg.rus_mod.items;

import com.mist_rg.rus_mod.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MaterialItem extends Item {

    public MaterialItem(){
        //super(new Item.Properties().group(ItemGroup.MATERIALS));
        super(new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB));
    }
}
