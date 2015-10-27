package structural.lazy_proxy.services;

import structural.lazy_proxy.services.real_services.RealService1;
import structural.lazy_proxy.services.real_services.RealService2;

public class LazyService implements Service {

	private String type;
	
	public LazyService(String type) {
		this.type = type;
	}
	
	@Override
	public void doSomething() {
		// RealService1 and RealService2 are big objects and we don't have to save it in memory.
		// Instead, we'll create them every time we need it. 
		
		if ("REAL_SERVICE_1" == type) {
			new RealService1().doSomething();
		}
		else if ("REAL_SERVICE_2" == type) {
			new RealService2().doSomething();
		}

	}

}
