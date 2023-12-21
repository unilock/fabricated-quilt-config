package cc.unilock.fqconfig.impl;

public final class Constants {
	public static final class LogCategory {
		public static final net.fabricmc.loader.impl.util.log.LogCategory CONFIG = net.fabricmc.loader.impl.util.log.LogCategory.create("Config");
	}

	public static final class SystemProperties {
		// the file extension to be used for configs that do not explicitly declare a specific extension
		public static final String DEFAULT_CONFIG_EXTENSION = "loader.defaultConfigExtension";
		// the file extension to use for ALL configs, overriding explicit defaults
		public static final String GLOBAL_CONFIG_EXTENSION = "loader.globalConfigExtension";
	}
}
