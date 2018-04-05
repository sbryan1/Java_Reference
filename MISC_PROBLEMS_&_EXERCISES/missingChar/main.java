/* missingChar
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"


*/




public class main{



    public static void main(String[] args){

        missingChar("kitten",4);

    }

    public static String missingChar(String str, int n){
        String front = str.substring(0,n);
        String back = str.substring(n+1, str.length());
    
        System.out.println(front);
        System.out.println(back);
        return front+back;
        /* Ex --- ("kitten",4)
                
            front = "kitten".substring(0,4) = kitt
            back =  (4 + 1, "kitten".length()) = n
                    (5,6) = n


            => front + back = "kittn"

        */


    }

}
