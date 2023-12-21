package cc.unilock.fabricated_quilt_config;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricatedQuiltConfig implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fabricated_quilt_config");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
