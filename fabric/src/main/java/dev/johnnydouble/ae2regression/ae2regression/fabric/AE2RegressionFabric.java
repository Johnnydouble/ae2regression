package dev.johnnydouble.ae2regression.ae2regression.fabric;

import dev.johnnydouble.ae2regression.ae2regression.AE2Regression;
import net.fabricmc.api.ModInitializer;

public class AE2RegressionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AE2Regression.init();
    }
}