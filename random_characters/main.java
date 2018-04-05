/*Generating Random Characters


    - every character has a unique unicode between 0 and 65536
        -> generating random character = generating random integer between 0 and 65535
    - 
    



*/
import java.util.*;


public class main{



    public static void main(String[] args){
 

//      System.out.println((int)('a'));
//      System.out.println((int)('z'));
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter lower bound character: ");
        String s1 = in1.nextLine();
        char l1 = s1.charAt(0);
        
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter upper bound character: ");
        String s2 = in2.nextLine();
        char u1 = s2.charAt(0);

        System.out.println("")        
        




//        double z = Math.random();
//        double lower = (z*('a'));
//        double upper = (z*('z'));
//        int range = (int)(upper - lower + 1); 
//        System.out.println("range = " + upper + " - " + lower + " = " + range);

//        System.out.println("range without addition of one = " + ('z' - 'a'));



//       int x = getRandomLetter();
//       System.out.println(x);




    }
}

/*
    public static int getRandomLetter(){
        return (int)(Math.random()*('z'-'a' + 1));
    }
}

*/