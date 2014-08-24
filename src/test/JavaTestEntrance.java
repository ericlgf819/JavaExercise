package test;

public class JavaTestEntrance {

	public static void main(String[] args) throws Exception {
		String strExample = "test.SQLiteTest";
		IExample ret = (IExample)Class.forName(strExample).newInstance();
		ret.start();
	}
}