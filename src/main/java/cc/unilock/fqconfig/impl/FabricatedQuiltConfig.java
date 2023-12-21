package cc.unilock.fqconfig.impl;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.quiltmc.loader.impl.config.QuiltConfigImpl;

public class FabricatedQuiltConfig implements PreLaunchEntrypoint {
    @Override
	public void onPreLaunch() {
		QuiltConfigImpl.init();
	}
}
