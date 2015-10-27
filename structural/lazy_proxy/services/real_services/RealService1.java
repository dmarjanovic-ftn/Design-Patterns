package structural.lazy_proxy.services.real_services;

import structural.lazy_proxy.services.Service;

public class RealService1 implements Service {

	@Override
	public void doSomething() {
		System.out.println("RealService1.doSomething()");
	}

}
