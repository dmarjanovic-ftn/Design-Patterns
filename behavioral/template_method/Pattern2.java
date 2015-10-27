package behavioral.template_method;

public class Pattern2 extends Template {

	@Override
	public int method1() {
		System.out.println("Pattern2.method1()");
		return 1;
	}

	@Override
	public void method2() {
		System.out.println("Pattern2.method2()");
	}

	@Override
	public void method3() {
		System.out.println("Pattern2.method3()");
	}

}
