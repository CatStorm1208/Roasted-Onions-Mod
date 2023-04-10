package de.catstorm.roastedonions;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("roastedonions")
public class roastedonions
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "roastedonions");

    public static final RegistryObject<Item> roastedonion = ITEMS.register("roastedonion",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(3.62f).build())));

    public static final RegistryObject<Item> blue_spandauer = ITEMS.register("blue_spandauer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(10f).build())));

    public static final RegistryObject<Item> red_spandauer = ITEMS.register("red_spandauer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(10f).build())));

    public static final RegistryObject<Item> golden_berries = ITEMS.register("golden_berries",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(10).saturationMod(10f).build())));

    public roastedonions()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}