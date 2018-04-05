package basic_exception_handling;

import java.util.*;

/* EXCEPTION HANDLING

    -errors and exceptions are the exact same thing

    -Exception Handling: solving a problem in a program without shutting it down



    -try-and-catch: you 'try' a bit of code, but if you have an error, instead of shutting down the program, you will 'catch' the error and do something with it


    
    //STRUCTURE:
    
        do{
            try{ //try doing this



            }
            catch(){ //but if you can't then do this instead

                //will never run if the try is successful


            }
        }while();





*/



public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Error Scenario:

            suppose you attempted to divide 12 by 0 
            you would recieve a 'java.lang.ArithmeticException'
       */
        int x = 1;
        do{
            try{
                System.out.print("Enter first num: ");
                int n1 = input.nextInt();
                System.out.print("Enter second num: ");
                int n2 = input.nextInt();
                int sum = n1/n2;
                System.out.println("\t RESULT: " + sum);
                x = 2;
            }
            catch(Exception e){
                System.out.println("\n-----CALCULATION ERROR, PLEASE TRY AGAIN-----\n");
            }
        }while(x == 1);
        /*

            'Exception e' is the broad exception calss, meaning if they do anything wrong at all we will execute the catch block


            the program will keep executing the 'try{}' block until there is no exception
                - if there is no exception, then 'x' will '= 2' and leave the try-catch-block and continue with the rest of the program




        */






    }



}