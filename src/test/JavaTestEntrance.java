package test;

public class JavaTestEntrance {

	public static void main(String[] args) throws Exception {
		String strExample = "test.FileDirectoryAccessExample";
		IExample ret = (IExample)Class.forName(strExample).newInstance();
		ret.start();
	}
}