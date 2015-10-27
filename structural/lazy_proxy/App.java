package structural.lazy_proxy;

import structural.lazy_proxy.services.LazyService;
import structural.lazy_proxy.services.ProxyService;

public class App {

	/*	If we need to save our memory and we don't have to instance our object now, but only
	 * 	we need it, we can put it off for a while and instance it only then we need it. 
	 * 
	 *  In that case we use pattern called LAZY PROXY.
	 */
	
	public static void main(String[] args) {
		
		ProxyService service = new ProxyService();
		
		service.addService(new LazyService("REAL_SERVICE_1"));
		service.addService(new LazyService("REAL_SERVICE_1"));
		service.addService(new LazyService("REAL_SERVICE_2"));
		service.addService(new LazyService("REAL_SERVICE_1"));
		service.addService(new LazyService("REAL_SERVICE_2"));
		service.addService(new LazyService("REAL_SERVICE_2"));
		
		service.doSomething();

	}

}
