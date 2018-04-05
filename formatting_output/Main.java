import java.util.Date;

public class Main{


    public static void main(String[] arsg){
        double x = 10000.0 / 3.0;
        System.out.printf("%8.2f", x);//3333.33
        //prints x with a field width of 8 characters and a precision of 2 characters
                                   


    /* FLAGS

            you can specify flags that control the appearance of the formatted output




        '+' - prints sign for positive and negative numbers
        ',' - adds group separaters/commas in numbers
        '0' - adds leading zeros

    */
        System.out.printf("%,8.2f",x); //3,333.33

        System.out.printf("%+8.2f",x);//3333.33

        System.out.printf("%08.2f",x);




    /*DATE AND TIME



        'tc' - outputs current time and date





    */

        System.out.printf("%tc", new Date());



	String s1 = "This is my string";
	int x1 = 385;



	System.out.printf("%-15s%03d %n",s1,x);




    }








}
