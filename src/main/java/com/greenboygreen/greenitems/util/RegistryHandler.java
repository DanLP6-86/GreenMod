package com.greenboygreen.greenitems.util;

import com.greenboygreen.greenitems.MainClass;
import com.greenboygreen.greenitems.blocks.BlockItemBase;
import com.greenboygreen.greenitems.blocks.GreenCrystalBlock;
import com.greenboygreen.greenitems.blocks.GreenCrystalOre;
import com.greenboygreen.greenitems.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainClass.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainClass.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> GREEN_SWORD = ITEMS.register("green_sword", ItemBase::new);
    public static final RegistryObject<Item> GREEN_CRYSTAL = ITEMS.register("green_crystal", ItemBase::new);



    //Blocks
    public static final RegistryObject<Block> GREEN_CRYSTAL_BLOCK = BLOCKS.register("green_crystal_block", GreenCrystalBlock::new);
    public static final RegistryObject<Block> GREEN_CRYSTAL_ORE = BLOCKS.register("green_crystal_ore", GreenCrystalOre::new);


    //Block Item
    public static final RegistryObject<Item> GREEN_CRYSTAL_BLOCK_ITEM = ITEMS.register("green_crystal_block", () -> new BlockItemBase(GREEN_CRYSTAL_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_CRYSTAL_ORE_ITEM = ITEMS.register("green_crystal_ore", () -> new BlockItemBase(GREEN_CRYSTAL_ORE.get()));
}
