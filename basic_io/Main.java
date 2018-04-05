import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // String input
        System.out.print("What is your name?");
        String name = in.nextLine();

        // Int input
        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year you'll be " + (age + 1));

        // char input
        System.out.println("Enter a character: ");
        Scanner in2 = new Scanner(System.in);
        String s = in2.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is: " + ch);     








    }
}