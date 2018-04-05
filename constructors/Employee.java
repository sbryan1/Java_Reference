package constructors;

class Employee{
	
	private String name;
	private int age;
	
	public Employee(String n, int a) {
		
		name = n;
		age = a;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Employee shea = new Employee("Shea Bryan", 19);
		
		System.out.println(shea.name);
		System.out.println(shea.age);

		
	}
	
	
	
	
	
	
	
}