package blayzer.finegui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraftforge.client.event.GuiOpenEvent;

public class EventHandler {

    private boolean shouldLoadGUI = true;

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void openMainMenu(GuiOpenEvent event) {
        if (shouldLoadGUI) {
            if (event.gui instanceof GuiMainMenu) {
                    event.gui = new GuiMultiplayer(null);
                    shouldLoadGUI = false;
            }
        }
    }
}
