package structural.lazy_proxy.services;

import java.util.ArrayList;

public class ProxyService implements Service {
	
	ArrayList<LazyService> services = new ArrayList<LazyService>();

	@Override
	public void doSomething() {
		for (LazyService service: services) {
			service.doSomething();
		}
	}
	
	public void addService(LazyService service) {
		this.services.add(service);
	}

}
