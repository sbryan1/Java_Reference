import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main{

        public static void main(String[] args)
        
            throws FileNotFoundException

        {
        File myFile = new File("thisfile.txt");
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }









        System.out.println("File path: " + myFile.getAbsolutePath()); //gets file path
        System.out.println("File name: " + myFile.getName());        //gets file name
        System.out.println("File size: " + myFile.length());        //gets file size











    }
}