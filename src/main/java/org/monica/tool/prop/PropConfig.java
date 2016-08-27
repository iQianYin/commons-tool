package org.monica.tool.prop;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropConfig {

	private Properties properties = new Properties();

	public PropConfig(String path) {
		InputStream stream = null;

		try {
			stream = new FileInputStream(path);
			properties.load(stream);
		} catch (Exception e) {
			throw new PropException(e.getMessage());
		} finally {
			close(stream);
		}
	}
	
	private void close(Closeable stream) {
		try {
			if (stream != null) {
				stream.close();
				stream = null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}

	public int getInteger(String key) {
		return Integer.parseInt(getValue(key));
	}

	public boolean getBoolean(String key) {
		return Boolean.parseBoolean(getValue(key));
	}

}
