package net.umc.aforestmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AForestMod.MODID)
public class AForestMod {

    public static final String MODID = "aforest";



    public AForestMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);




    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }




}
