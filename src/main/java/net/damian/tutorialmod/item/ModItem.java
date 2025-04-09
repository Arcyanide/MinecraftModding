package net.damian.tutorialmod.item;

import net.damian.tutorialmod.TutorialMod;
import net.damian.tutorialmod.item.custom.WandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = Items.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = Items.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WAND = Items.register("wand",
            () -> new WandItem(new Item.Properties().durability(120)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
