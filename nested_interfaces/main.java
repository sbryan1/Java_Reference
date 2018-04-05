/*NESTED INTERFACES

 * 
 * Nested interfcaces are used to group related interfaces so that they can be easy to maintain  
 * 
 * - must be referred by the outer interface or class
 * - it can't be accessed directly
 * - nested interfaces are declared static implicitely
 * 
 * - if a class implemenetse a nested interface, it also implements the parent interface
 * 
 * 
 * 
 * - top-level interface cannot be private, it can only have a public or package access, however, the nested interface can be private
 *
 * 
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * INTERFACES INSIDE CLASSES <--see myClass2 from Ints.java -->
 * 
 *			Interfaces can be declared inside a class to encapsulate behavior in a generic and resuable way
 *
 * 
 * 			in this example, myClass3 is the sub-class of myClass2, therefore it implements IntC
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

package nested_interfaces;

public class main{
	
	public static void main(String[] args) {
		myClass1 mc1 = new myClass1();
		mc1.executeA();
		mc1.executeB();
		
		
		myClass3 mc3 = new myClass3();
		mc3.executeC();
		
		
	}
}