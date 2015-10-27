package structural.proxy.services;

import java.util.Random;

public class RealService implements Service {

	@Override
	public void foo() {

		Random r = new Random();		
		for (int i = 0; i < r.nextInt(10000) + 5000; ++i)
			System.out.print("");
	}

	@Override
	public void bar() {
		
		Random r = new Random();
		for (int i = 0; i < r.nextInt(10000) + 5000; ++i)
			System.out.print("");
	}

}
