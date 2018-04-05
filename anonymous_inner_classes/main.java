
/* Anonymous classes

    - classes with no name that are defined at object creation and are used solely for the purpose of overriding a method



*/






public class main{



    public static void main(String[] args){
        
        A obj1 = new A();
        obj1.execute();


        A obj2 = new B();
        obj2.execute();       
        
        

        //Anonymous class reaction with no class name
        A obj3 = new A()
                {
                    public void execute(){
                        System.out.println("Executing ' ' method");
                    }
                };
        obj3.execute();



    }
}



class A{

    public void execute(){
        System.out.println("Executing 'A' method");
    }

}

//sub class with explicit overriding of the execute() method
class B extends A{
    public void execute(){
        System.out.println("Executing 'B' method");
    }
}
