package org.adlin.hitboxesmod;

import net.fabricmc.api.ModInitializer;

public class HitboxesMod implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        config.setSize(0.3f);
    }
}
