package test;

public class DelegateExample implements IExample {

	private int m_iData = 7;
	
	public static interface IMyDelegate {
		String MyFunc(int iInput);
	}
	
	private String OutputString(int i) {
		return String.valueOf(i + this.m_iData);
	}
	
	private static String StaticOutputString(int i) {
		return String.valueOf(i);
	}
	
	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		IMyDelegate mydelegate = (i) -> String.valueOf(i + 77);
		IMyDelegate mydelegate1 = DelegateExample::StaticOutputString;
		IMyDelegate mydelegate2 = this::OutputString;
		
		System.out.println(mydelegate.MyFunc(1));
		System.out.println(mydelegate1.MyFunc(1));
		System.out.println(mydelegate2.MyFunc(1));
	}
}
