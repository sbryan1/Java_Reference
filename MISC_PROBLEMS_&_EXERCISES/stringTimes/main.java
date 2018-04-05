/* stringTimes


Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"


*/

public class main{



    public static void main(String[] args){


        
    }

    public String stringTimes(String str, int n) {
        String newstring = new String();
        for(int i = 0; i < n; i++){
          newstring += str;
        }
        return newstring;
        
    }
      
    

}
