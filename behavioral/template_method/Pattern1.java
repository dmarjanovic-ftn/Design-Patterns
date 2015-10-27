package behavioral.template_method;

public class Pattern1 extends Template {

	@Override
	public int method1() {
		System.out.println("Pattern1.method1()");
		return -1;
	}

	@Override
	public void method2() {
		System.out.println("Pattern1.method2()");
	}

	@Override
	public void method3() {
		System.out.println("Pattern1.method3()");
	}

}
