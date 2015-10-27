package behavioral.template_method;

public abstract class Template {
	
	/*
	 *  Use Template Method Pattern when you have to do something on same order, but you can change way of doing it.
	 *  e.g. 
	 *  	First you need to execute first method, and if return value is greater than 0 then 
	 *  	execute second method, else execute third method, and then execute print.
	 *  
	 *  	int a = method_1()
	 *  
	 *  	if a > 0 then
	 *  		method_2()
	 * 		else
	 * 			method_3()
	 * 
	 * 		print()
	 */
	
	public void doSomething() {
		int a = method1();
		
		if (a > 0) {
			method2();
		}
		else {
			method3();
		}
		
		print();
	}
	
	public void print() {
		System.out.println("This is always same!\n");
	}
	
	public abstract int method1();
	public abstract void method2();
	public abstract void method3();

}
