package test;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class JavaToolTest {

	public static void main(String[] args) {
		File f = new File("D:/erichello.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		try {
            FileWriter writer = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Yooo");
            bw.newLine();
            bw.flush();
            writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
