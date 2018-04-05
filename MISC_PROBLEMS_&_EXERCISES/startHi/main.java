/* startHi


Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false


*/

public class main{



    public static void main(String[] args){


        
    }
    public boolean startHi(String str) {
        return(str.matches("hi.*"));
    }
      
}
