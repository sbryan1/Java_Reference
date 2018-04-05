/* End of File (EOF) --- condition in OS where no more data can be read from a data source


CHALLENGE:here is to read 'n' lines of input until you reach EOF, then number and print all  lines of content.



java.util.Scanner
    
    - hasNext() --- returns true if scanner has another token in its input
    - nextLine() --- returns the rest of the current line ecluding any line seperator at the end 
    - close() --- closes the scanner



*/






import java.util.*;


public class main{




    public static void main(String[] args){

            Scanner sc = new Scanner(System.in); //java.util.Scanner

            int line_num = 0;
            while(sc.hasNext()){   
                System.out.println(++line_num + " " + sc.nextLine());
        
            }
            sc.close();
    }
}