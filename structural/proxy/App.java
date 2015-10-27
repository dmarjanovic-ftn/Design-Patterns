package structural.proxy;

import java.util.Random;

import structural.proxy.services.ProxyService;

public class App {
	
	/*
	 * 		EXAMPLE: Poor Man's Profiler
	 * 
	 * 		Get number of calls and total time for each method in class.
	 */

	public static void main(String[] args) {

		ProxyService service = new ProxyService();
		Random r = new Random();

		for (int i = 0; i < 15; ++i) {
			if (r.nextDouble() > 0.5) {
				service.foo();
			}
			else {
				service.bar();
			}
		}
		
		System.out.println(" Number of calls:\t" + service.getCounter());
		System.out.println(" Total time:\t\t" + service.getTotalTime());
		
	}

}
