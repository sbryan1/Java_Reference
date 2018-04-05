/* Super keyword

    - can refer to immediate parent class instance variable
    - can invoke immediate parent class method
    
    
    super() --- invokes immediate parent class constructor


*/


public class main{



    public static void main(String[] args){

        subClass sc1 = new subClass();
        sc1.printSuperName();
        sc1.superExecute();
        
    }


}

class superClass{

    String name = "superObj name";
    void execute(){
       System.out.println("superclass method called"); 
    }
    
    superClass(){
       System.out.println("superClass constructor called");
    }






    
}


class subClass extends superClass{

    

    //refering to immediate parent class instance variable
    void printSuperName(){
        System.out.println(super.name);
    }



    //invoking parent class method
    void superExecute(){
        super.execute();
    
    }

    //invoking parent constructor
    subClass(){
        super();
        System.out.println("subClass constructor called");
    }


}