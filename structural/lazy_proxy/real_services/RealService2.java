package structural.lazy_proxy.real_services;

import structural.lazy_proxy.services.Service;

public class RealService2 implements Service {

	@Override
	public void doSomething() {
		System.out.println("RealService2.doSomething()");
	}

}
