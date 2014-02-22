package test;

public class JavaTestEntrance {

	public static void main(String[] args) throws Exception {
		String strExample = "test.PropertyAccess";
		IExample ret = (IExample)Class.forName(strExample).newInstance();
		ret.start();
	}
}