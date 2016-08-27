package org.monica.tool.prop;

import java.util.HashMap;
import java.util.Map;

public class PropHelper {

	private Map<String, PropConfig> props = null;

	private static class PropHolder {
		private static final PropHelper INSTANCE = new PropHelper();
	}

	private PropHelper() {
		props = new HashMap<String, PropConfig>();
	}

	private static PropHelper getInstance() {
		return PropHolder.INSTANCE;
	}

	public static void addProp(String name, String path) {
		PropHelper self = getInstance();

		if (!self.props.containsKey(name)) {
			self.props.put(name, new PropConfig(path));
		}
	}

	public static PropConfig getProp(String name) {
		return getInstance().props.get(name);
	}

}
