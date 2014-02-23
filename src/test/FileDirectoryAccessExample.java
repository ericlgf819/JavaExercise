package test;

import java.io.File;

public class FileDirectoryAccessExample implements IExample {

	@Override
	public void start() throws Exception {
		File root = new File("./");
		for (File f : root.listFiles()) {
			System.out.println(String.format("Name: %s Directory: %s File: %s", f.getName(), f.isDirectory(), f.isFile()));
		}
	}

}
