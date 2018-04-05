/* Casting ---d: forcing the conversion from one type to another 

		includes: 
			-UPCASTING
			-DOWNCASTING


 */




public class main{
	
	public static void main(String[] args) {
		
		
		//basic example
		double x = 3.405;
		int nx = (int) x;
		System.out.println(nx); //will cut off the .405
		




		Object o = "a String";
		String s = (String) o;








	/*OBJECT CASTING
	*/
		Flower f1 = new Flower();
		Rose r1 = new Rose();
		
		
		f1.FlowerAction();
		r1.FlowerAction();



		/*UPCASTING ---d: subclass object assigned to a superclass object

			- we need upcasting when we want to write general code that deals only with the supertype


		
			-casting the Rose type to the Flower type
				the flower is the supertype of the rose
			- the actual object type does not change because of casting, only the reference type gets changed

		
		*/
			f1 = (Flower) r1; 
			f1.FlowerAction();

			Flower f2 = new Rose();
			f2.FlowerAction();

			Flower f3 = new Flower();

			//implicit upcasting
			f3 = r1;
			f3.FlowerAction();



		//DOWNCASTING  ---d: 
			Flower f4 = new Rose();
			Rose r2 = (Rose) f4;



			
		
	}		
}
		
class Flower{
	public void FlowerAction(){
		System.out.println("Flower method executed");
	}
}
class Rose extends Flower{
	public void FlowerAction(){
		System.out.println("Rose method executed");
	}
}




	
	
