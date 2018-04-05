

/* Final Classes

    a final class cannot be subclassed 
        -   no other class can extend that final class

    |- a final method cannot be overriden by subclasses

    |- a final variable can only be initialized once


    - for refernces to objects final ensures the reference will never change, meaning that it will always refer to the same object





*/


public final class myClass{//FINAL CLASS

    static final int x = 92837492;//FINAL VARIABLE


    public static void main(String[] args){

        
        x++; //error because x is is final 





    }    
}


class otherClass extends myClass{} //error because another class cannot inherit from a final class

class someOtherClass{
    final public void someOtherMethod(){
        System.out.println("'someOtherMethod()' called from 'someOtherClass'");
    }
}

class someOtherOtherClass extends someOtherClass{
    public void someOtherMethod(){}; //error because 'someOtherMethod()' from 'someOtherClass' is final

}