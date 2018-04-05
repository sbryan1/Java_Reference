/* this




    - can be used to reference a class's hidden data fields
    


*/



public class main{



    public static void main(String[] args){

        myClass mc1 = new myClass();




        System.out.println(mc1.j);
        //System.out.println(mc1.i); //not allowed, 'i' has private acess
        System.out.println(mc1.getI()); //overrides private access







        System.out.println(mc1.name);

        myClass mc2 = new myClass();
        System.out.println(mc2.name);

        myClass mc3 = new myClass("MYobj");
        System.out.println(mc3.name);
        









        
    }
}



class myClass{

    static int objCount = 0;

    private int i = 84938;
    public int j = 2394892;

    //allowing access to hidden (private) fields
        public void setI(int i){
           this.i = i;
        }
        public int getI(){
           return this.i;
        }















    /*using "this" to invoke a constructor

        in this case, we are giving a default name to an object when not assigned 
    
    */
        public String name;




        public myClass(String n){
            objCount++;
            this.name = n;
        }


        //constructor overloading
        public myClass(){
            objCount++;
            this.name = "myClassObj___" + objCount;

        }










}

