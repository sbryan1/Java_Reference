package nested_interfaces;

//declaring an interface inside another interface
interface IntA{
	
	void executeA();
	
	interface IntB{
		
		
		void executeB();
		
		
	}
	
	
	
	
}






//myClass1 has access to both execute methods from interface IntA and the nested interfaces IntB
class myClass1 implements IntA.IntB{
	
	public void executeA() {
		System.out.println("executeA() method of IntA called from myClass1");

	}
	
	public void executeB() {
		System.out.println("executeB() method of IntA.IntB called from myClass1");
	}
}






class myClass2{
	interface IntC{
		public void executeC();
	}
}

class myClass3 extends myClass2{
	public void executeC() {
		System.out.println("executeC() method of myClass2.IntC called from myClass3");
	}
}





