package test;

import java.io.InputStream;
import java.util.Properties;

public class PropertyAccess implements IExample {

	@Override
	public void start() throws Exception {
		try (InputStream stream = this.getClass().getResourceAsStream("/res/myconfig")) {
			Properties prop = new Properties();
			prop.load(stream);
			System.out.println(prop.getProperty("Eric"));
		}
	}

}
