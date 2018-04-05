/*Method overloading --- enables you yto define the methods with the same name as long as their signatures are different



    ex)--you want to max() int types and float types under the same method name



*/




public class main{



    public static void main(String[] args){


        System.out.println(max(34,2387));
        System.out.println(max(234.1234,2934.234));        



    }

    public static int max(int i1, int i2){
        if(i1 > i2){
            return i1;
        }
        else return i2;
    }



    public static double max(double d1, double d2){

        if(d1 > d2){
            return d1;
        }
        else return d2;



    }







}