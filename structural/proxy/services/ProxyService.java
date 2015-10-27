package structural.proxy.services;

import java.util.HashMap;

public class ProxyService implements Service {
	
	private RealService service;
	private HashMap<String, Integer> counter;
	private HashMap<String, Long> totalTime;
	
	public ProxyService() {
		service = new RealService();
		counter = new HashMap<String, Integer>();
		totalTime = new HashMap<String, Long>();
	}

	@Override
	public void foo() {

		long startTime = System.currentTimeMillis();
		service.foo();
		long value = System.currentTimeMillis() - startTime;
		
		String key = new Object(){}.getClass().getEnclosingMethod().getName();
		
		this.addToCounter(key);
		this.addToTotalTime(key, value);

	}

	@Override
	public void bar() {
		
		long startTime = System.currentTimeMillis();
		service.bar();
		long value = System.currentTimeMillis() - startTime;
		
		String key = new Object(){}.getClass().getEnclosingMethod().getName();
		
		this.addToCounter(key);
		this.addToTotalTime(key, value);

	}
	
	private void addToCounter(String key) {
		if (counter.containsKey(key)) {
			counter.put(key, counter.get(key) + 1);
		}
		else {
			counter.put(key, 1);
		}
	}
	
	private void addToTotalTime(String key, Long value) {
		if (totalTime.containsKey(key)) {
			totalTime.put(key, totalTime.get(key) + value);
		}
		else {
			totalTime.put(key, value);
		}
	}

	public HashMap<String, Integer> getCounter() {
		return counter;
	}

	public void setCounter(HashMap<String, Integer> counter) {
		this.counter = counter;
	}

	public HashMap<String, Long> getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(HashMap<String, Long> totalTime) {
		this.totalTime = totalTime;
	}

}
