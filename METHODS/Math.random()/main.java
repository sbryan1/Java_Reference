/* Math.random()



    from --> "java.lang.Math.random()"



    random() returns double value pseudorandomly with a positive sign >= to 0.0 and < 1.0 





*/









public class main{



    public static void main(String[] args){

        double rand = Math.random(); //random number from 0.0 to 1.0
        System.out.println(rand);


        //random number from 1 to 10
        
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int rand2 = (int)(Math.random()*range) + min;
        System.out.println(rand2);


        //random number from 45 to 100
    
        int max2 = 100;
        int min2 = 45;
        int range2 = max2 - min2 + 1;
        int rand3 = (int)(Math.random()*range2) + min2; 
        System.out.println(rand3);        



    }
}