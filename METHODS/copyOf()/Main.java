import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] smallPrimes = {2,3,5,7,11,13};
        int[] luckyNumbers = smallPrimes;
        //both smallPrimes and luckyNumbers refer to the same array
        luckyNumbers[5]=12; //now smallPrimes[5]=12

        //now we are going to copy all values into a new array
        int[] copiedNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        for(int x: copiedNumbers) System.out.print(x + " ");

        //increasing length of the new array,it just fills additionall elements 
       copiedNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
       System.out.print('\n');
       for(int x: copiedNumbers) System.out.print(x + " ");
    
    }
}