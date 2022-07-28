package com.meteor.meteorcertainidea.common.item;

import com.meteor.meteorcertainidea.common.lib.LibItemName;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, LibMisc.MOD_ID);

    //public static final RegistryObject<Item> FLAMESCION_SWORD = register(LibItemName.FLAMESCION_SWORD, () -> new ItemFlamescionSword(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> MOTOR = register(LibItemName.MOTOR, () -> new ItemMotor(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> UFO_KEY = register(LibItemName.UFO_KEY, () -> new ItemUfoKey(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> TURTLE = register(LibItemName.TURTLE, () -> new ItemTurtle(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    //public static final RegistryObject<Item> PHOENIX_FEATHER = register(LibItemName.PHOENIX_FEATHER, () -> new ItemPhoenixFeather(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> BHPL = register(LibItemName.BHPL, () -> new ItemBHPL(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> BHPR = register(LibItemName.BHPR, () -> new ItemBHPR(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> PAIMONCARRIAGE = register(LibItemName.PAIMONCARRIAGE, () -> new ItemPaimonCarriage(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> PAIMON = register(LibItemName.PAIMON, () -> new ItemPaimon(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> COIN = register(LibItemName.COIN, () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON)));

    private static RegistryObject<Item> register(String name, Supplier<Item> item) {
        return REGISTER.register(name, item);
    }

}
