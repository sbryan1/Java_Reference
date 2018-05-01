import java.util.Scanner;
import java.String;


public class main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());



        //testing to see if string A is lexicographically first
        if(A.compareTo(B) < 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }




    }






}