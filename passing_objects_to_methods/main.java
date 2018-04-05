/* Passing objects to methods
    - passing an object is passing the reference to an object, in which all of its fields are passed with it


*/



public class main{



    public static void main(String[] args){

        myObj o1 = new myObj("thisobj",2349);
        printObj(o1);

        
    }


    public static void printObj(myObj o){
        System.out.println(o.getName());
        System.out.println(o.getId_no());
    }



}

class myObj{


    myObj(String x, int y){
        this.name = x;
        this.id_no = y;
    }

    private String name;
    private int id_no;


    public String getName(){return name;}
    public int getId_no(){return id_no;}

}
