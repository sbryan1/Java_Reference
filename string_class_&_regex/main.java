/* The String Class and regex

    the "String" object is immutable

    a "String" object holds a reference to a "String" object that stores a string value


    regex -- regular expression --- a string that describes a pattern for matching a set of strings






*/






public class main{



    public static void main(String[] args){



        //string object from a string literal
            String s1 = new String("my string 1");


        /*interned strings







        */
            String s2 = "Java";          //  "String" object with content "Java", assigns reference to 's'
            s2 = "HTML";                 //  new "String" object with content "HTML" assigned to reference 's'. The first object still exists but can no longer be accessed because 's' now points to the new object
            
            String s3 = "Python";
            String s4 = new String("Python");
            String s5 = "Python";
                /*
                    s3 and s5 refer to the same interned string "Python", hence they are the same object with two different references.
                    However, s4 is its own object

                */



    // replace(), replaceAll()
        String s6 = "this is my string";
        System.out.println(s6.replace('t','A'));
        System.out.println(s6.replaceFirst("t","alskdjklkasjlkjfsdadlkjdsjlkfdskj"));






        String s7 = "Shea*Thomas%Asa#Bryan";
        System.out.println(s7.replaceAll("[*+%+#]", " ")); // specifies a pattern matching '*', '%', or '#'






    //split() --- extracts tokens from a string with specified delimiters into an array of string
    
        String[] tokens1 = "Shea%Thomas%Asa%Bryan".split("%");
        for(String x : tokens1) {System.out.println(x);}
            
        String[] tokens2 = "Bryan?Asa!Thomas@Bryan".split("[?!@]");
        for(String x : tokens2) {System.out.println(x);}



        

    /*patterns

        matches() can match a fixed string or a set of strings that follow a pattern




    */
        if("Java".equals("Java")) System.out.println("True");

        if("Java is the worst programming language ever".matches("Java.*")) System.out.println("True"); //describes a string pattern that beings with "Java" followed by any zero or more characters

        // \\d --- digit patterns
            if("590-467-8292".matches("\\d{3}-\\d{3}-\\d{4}")) System.out.println("True");



    






































    // Conversion from string to character array

        char[] chars1 = "JavaProgramming".toCharArray();
        for(char x: chars1) System.out.println(x);



        //copying a substring of a string into a character arrary
            char[] chars2 = new char[11];
            "JavaProgramming".getChars(4,15,chars2,0);// getChars(int source_begin, int source_end, char[] destination, int destination_begin)
            for(char x : chars2) System.out.print(x);





















    //converting from array of characters into a string
    






    }
}
