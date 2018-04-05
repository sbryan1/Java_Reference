package interfaces;




public interface myInterface1 {
	
	int interfaceNum = 5;
	
	
	void method1();
	void method2();
}

class myClass1 implements myInterface1{
		public void method1() {
			System.out.println("myClass1 implementation of method1()");
		}
		public void method2() {
			System.out.println("myClass1 implementation of method2()");
		}
		
		
}

class myClass2 implements myInterface1{
	public void method1() {
		System.out.println("myClass2 implementation of method1()");
	}
	public void method2() {
		System.out.println("myClass2 implementation of method2()");
	}

}









