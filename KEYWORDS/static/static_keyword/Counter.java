//Variable Without Static Keyword



package static_Keyword;

public class Counter
 {
	
	int cAcounts = 0; //will get memory when every time an instance is created, but will always be 1
	static int cBcounts = 0; //will get memory only once and retain its value
	 
	
	
	public static void main(String[] args) {
		
		CounterA cA1 = new CounterA();
		CounterA cA2 = new CounterA();
		CounterA cA3 = new CounterA();
		CounterA cA4 = new CounterA();

		
		System.out.println('\n');
		
		
		
		CounterB cB1 = new CounterB();
		CounterB cB2 = new CounterB();
		CounterB cB3 = new CounterB();
		CounterB cB4 = new CounterB();

	
		
		
		
	}

}



//without static keyword --see--> " int cAcounts = 0 "
class CounterA extends Counter{ //extends so it can access cAcounts
	CounterA(){
		cAcounts++;
		System.out.println(cAcounts);
		
	}
}

//with static keyword --see--> " static int cBcounts = 0 "
class CounterB extends Counter{ //extends so it can access cAcounts
	CounterB(){
		cBcounts++;
		System.out.println(cBcounts);
	}
}