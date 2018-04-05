/*STATIC FIELDS

    - only one static field per class

    
    - each object has its own copy of all instance fields


    - static fields belong to the class, not any individual object

*/


public class Employee{

    static int nextId=1;
    int id;
    /*
        - every employee object now has its own id field, but there is only one nextId field that is shared among all instances of the class
            
            -if 1000 Employee objects, there are 1000 instance fields'id' field but but only 1 instance of the 'nextId' field shared among all the objects
            
                - even if 0 Employee objects, the static field 
                nextId' is still present

    */

    public void setId(){
        id = nextId;
        nextId++;
    }



    public static void main(String[] args){

            Employee harry = new Employee();
            harry.setId();
            System.out.println("Harry's id: " + harry.id);
            System.out.println("nextId: " + Employee.nextId);

            Employee kasandra = new Employee();
            kasandra.setId();
            System.out.println("Kasandra's id: " + kasandra.id);
            System.out.println("nextId: " + Employee.nextId);


    }
}