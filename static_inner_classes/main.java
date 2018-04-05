/*Static Inner/Nested Classes

    - used for when you dont need the inner class to have a reference to the outer class by declaring the inner class as static




    - a static inner class can access all static members of the outer class (even private)
    - a static inner calss can have all levels of access applied except for private
    - a static inner class can be final or abstract
    - a static inner class can extend other classes and implement interfaces



*/




public class main{



    public static void main(String[] args){

        A.B.display();
        




        
    }
}


class A{

    String s1 = "A string1";
    private static String s2 = "A string2";


    static class B{

        static String s1 = "B string";
        static void display(){
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(new A().s1);
        }




    }
}