package test;

public class ClassStaticBlock implements IExample {
	private String strPivot = "inital";
	{
		strPivot = "pivot 1";
		System.out.println(strPivot);
	}

	public ClassStaticBlock() {
		strPivot = "pivot 2";
		System.out.println(strPivot);
	}

	{
		strPivot = "pivot 3";
		System.out.println(strPivot);
	}
	
	static
	{
		System.out.println("static scope call");
	}

	@Override
	public void start() throws Exception {
		System.out.println(strPivot);
	}

}
