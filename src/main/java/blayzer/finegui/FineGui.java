package blayzer.finegui;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "finegui", name = "FineGui", version = "@VERSION@", canBeDeactivated = true)
public class FineGui {


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        FMLCommonHandler.instance().bus().register(new EventHandler());
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}
