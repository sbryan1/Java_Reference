/* Abstract classes
    
    
    
    
    
    - 
    - a class with one or more abstract methods itself must be declared abstract
    - have fields and concrete methods

    Abstract methods --- acts as placeholders for methods that are implemented in subclasses



    2 choices when extending an abstract class
        
        1. can leave all or some abstract methods undefined, and must tag subclass as abstract
      or  
        2. define all methods, and subclass is no longer abstract








*/

public class main{
    public static void main(String[] args){


		Employee E1 = new Employee("Jim");
		



	}
}

abstract class Person{

    public abstract String getDescription();

    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Employee extends Person{

    private double salary;
    
    
}

class student extends Person{

}





