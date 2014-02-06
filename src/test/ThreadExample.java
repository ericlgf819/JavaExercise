package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample implements Runnable, IExample {

	@Override
	public void start() throws Exception {
		ExecutorService svc = Executors.newCachedThreadPool();
		
		svc.execute(this);
		Future<?> f = svc.submit(this);
		System.out.println(f.isDone());
		
		//Thread.sleep(10);
		System.out.println("end");
		//System.exit(0);
		Thread.sleep(5000);
		System.out.println(f.isDone());
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
            System.out.println("thread show");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
