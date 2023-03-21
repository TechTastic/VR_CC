package io.github.techtastic.vrcc.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.techtastic.vrcc.VRCCMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VRCCMod.MOD_ID)
public class VRCCModForge {
    public VRCCModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(VRCCMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        VRCCMod.init();
    }
}
