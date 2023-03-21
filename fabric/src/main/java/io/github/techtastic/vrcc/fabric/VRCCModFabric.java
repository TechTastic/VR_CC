package io.github.techtastic.vrcc.fabric;

import io.github.techtastic.vrcc.VRCCMod;
import net.fabricmc.api.ModInitializer;

public class VRCCModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VRCCMod.init();
    }
}
