package io.github.techtastic.vrcc.forge;

import io.github.techtastic.vrcc.VRCCExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class VRCCExpectPlatformImpl {
    /**
     * This is our actual method to {@link VRCCExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
