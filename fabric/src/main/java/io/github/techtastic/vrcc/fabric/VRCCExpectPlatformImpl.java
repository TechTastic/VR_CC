package io.github.techtastic.vrcc.fabric;

import io.github.techtastic.vrcc.VRCCExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class VRCCExpectPlatformImpl {
    /**
     * This is our actual method to {@link VRCCExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
