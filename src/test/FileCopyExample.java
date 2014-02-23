package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyExample implements IExample {

	@Override
	public void start() throws Exception {
		File file = new File("d:/hosts");
		try (FileInputStream fis = new FileInputStream(file)) {
            try (FileOutputStream fos = new FileOutputStream("D:/javaoutput")) {
            	byte[] buffer = new byte[1024];
            	while (-1 != fis.read(buffer)) {
            		fos.write(buffer);
            	}
            }
		}
		System.out.println("Copy done!");
	}

}
