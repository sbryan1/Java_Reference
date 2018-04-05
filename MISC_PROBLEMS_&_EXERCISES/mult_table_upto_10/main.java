//Write a Java program that takes a number as input and prints its multiplication table upto 10



import java.util.*;


public class main{


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);       

        int input = in.nextInt();


        for(int i = 1; i <= 10; i++){
            System.out.println(input + "x" + i + "=" + input * i);
        }
        


    }


}