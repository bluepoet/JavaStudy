package net.bluepoet.lambda;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("HelloWorld one!");
			}
		};
		
		Runnable r2 = () -> System.out.println("HelloWorld two!");
		
		r1.run();
		r2.run();
	}
}
