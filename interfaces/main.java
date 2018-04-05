


/*  INTERFACES
 * 
 * - java doesn't support multiple (hybrid) inheritance with classes, therefore hybrid inheritence can be achieved only through interfaces
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Interfaces can have methods and variables like classes
 *  - but methods by default are abstract
 *  - all variables are public, static, and final
 * 
 * 
 * 
 * - methods must be implemented by class before you can access them 
 * 
 * - can be used as a way to achieve polymorphism
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



package interfaces;

public class main{

	public static void main(String[] args) {
		
		myInterface1 obj1 = new myClass1(); //interface instance
		obj1.method1();
		obj1.method2();
		System.out.println(obj1.interfaceNum);
		
		
		
		
		
		myInterface1 obj2 = new myClass2(); //interface instance
		obj2.method1();
		obj2.method2();
		System.out.println(obj2.interfaceNum);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
