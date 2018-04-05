package array_initializers_and_anomymous_arrays;



public class Main{

    public static void main(String[] args){

        //creates object and supplies initial values at the same time
        int[] smallPrimes = {2,3,5,7,11,13};
        for(int x: smallPrimes) System.out.print(x + " ");

        System.out.print('\n');

        /* Anonymous Array


            - allocates a new array and fills it with the values inside the braces
            - counts the number of initial values and sets the array size accordingly.
            - You can use this syntax to reinitialize an array without creating a new variable
            


        */
        smallPrimes = new int[] {1,2,3,4,5,6,7};
        for(int x: smallPrimes) System.out.print(x + " ");
        System.out.print('\n');

      
         //or
        int[] Anonymous = {8,9,10,11,12,13,14,15};
        smallPrimes = Anonymous;
        for(int x: smallPrimes) System.out.print(x + " ");

} 


    }
