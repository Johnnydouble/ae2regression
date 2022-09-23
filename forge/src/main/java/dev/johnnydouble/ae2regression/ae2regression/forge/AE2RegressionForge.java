package dev.johnnydouble.ae2regression.ae2regression.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.johnnydouble.ae2regression.ae2regression.AE2Regression;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AE2Regression.MOD_ID)
public class AE2RegressionForge {
    public AE2RegressionForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AE2Regression.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            AE2Regression.init();
    }
}