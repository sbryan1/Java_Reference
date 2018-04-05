/* Immutable Objects and Classes

    immutable object/class --- contentcs cannot be changed once the object is created

    - all data fields must be private and cannot contain public setter methods for and data fields

    - no mutator methods for data fields

    - no access methods can return a reference to a data field that is mutable

    - declare the class as final so it can't be extended


    - does not share references outside the classes (if references to fields are mutable are access from code outside the class, they can modify the contents of the object)

    - only access methods (getters, no setters)



    ex) 
        - java.lang.String
        - java.lang.Float

    - all fields must be final so it's value can be assigned only once

    

*/





public class main{



    public static void main(String[] args){

        Student s1 = new Student("Shea", 12341);


        
    }
}

final class Student{
    private final String name;
    private final int id_no;
    
    
    //only allowed setter (at object creation)
    public Student(String s, int i){
        this.name = s;
        this.id_no = i;
    }
    //getter
    public String getName(){
        return this.name;
    }
    //getter
    public int getID(){
        return this.id_no;
    }
}