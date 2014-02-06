package test;

public class ReflectExample implements IExample {

	@Override
	public void start() throws Exception {
		Class<?> ret = Class.forName("test.ReflectExample");
		Class<?> supercls = ret.getSuperclass();
		System.out.println(supercls);
	}

}
