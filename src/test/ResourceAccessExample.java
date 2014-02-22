package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceAccessExample implements IExample {

	@Override
	public void start() throws Exception {
		try (InputStream stream = this.getClass().getResourceAsStream("/res/data.txt")) {
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader breader = new BufferedReader(reader);
			String val = null;
			while ((val = breader.readLine()) != null)
				System.out.println(val);
		}
	}

}
