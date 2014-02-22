package test;

import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileAccessExample implements IExample {

	@Override
	public void start() throws Exception {
		Path path = FileSystems.getDefault().getPath("./data.txt");
		List<String> ret = Files.readAllLines(path, Charset.forName("UTF-8"));
		for (String strContent : ret) {
			System.out.println(strContent);
		}
	}

}
