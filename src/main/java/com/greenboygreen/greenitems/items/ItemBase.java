package com.greenboygreen.greenitems.items;

 import com.greenboygreen.greenitems.MainClass;
 import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(MainClass.TAB));
    }
}
