/*Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

*/


public class main{



    public static void main(String[] args){


        
    }






    public String notString(String str){
        if(str.length() >= 3 && str.substring(0, 3).equals("not")){ //the first condition "str.length() >= 3" is necessary because if you had an input with less than 3 characters,then you would get a "StringIndexOutOfBoundsException"  
            return str;
        }

        return "not " + str;
    }


}
