/* Initialization Blocks







    Static Initilization Blocks
    - not dependent on upona  constructor to be invoked
    - executed when the class is first accessed either to
    
            create an instance
           or 
            directly access a class variable or a static method

    - will only be executed once throughout the entire program



    Instance Initilization Blocks
    - run each time you instantiate an object
    


*/








public class main{
 

    public static void main(String[] args){
 
 
        myClass mc1 = new myClass();
        myClass mc2 = new myClass();






 
 
    }
} 

class myClass{

    //static initialization block
    static{
        System.out.println("Inside Static Initilization Block");
    }


    //instance initialization block
    {
        System.out.println("Inside Instance Initilization Block");
       
    }
}