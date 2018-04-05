/* Multi-dimensional arrays

    syntax ---- elementType[# of rows][# of columns] refvar;
             or 
                elementType refvar[# of rows][# of columns];








    - each row in a two-dimensional array is itself an array



*/




public class main{



    public static void main(String[] args){

    
    //declaration of a 5-by-5 int matrix full of zeros
        int[][] m1 = new int[5][5]; 
        //specific assignment
            m1[2][1]=7;
            //printing arrays
                for(int row = 0; row < m1.length; row++){
                for(int column = 0; column < m1[row].length; column++){
                    System.out.print(m1[row][column] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");





    

    
    //declaring, creating and initializing
        int[][] m2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
            for(int row = 0; row < m2.length; row++){
                for(int column = 0; column < m2[row].length; column++){
                    System.out.print(m2[row][column] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");






    //ragged array
        int[][] m3 = {
            {1,2,3},
            {2,3},
            {3}
        };
            for(int row = 0; row < m3.length; row++){
                for(int column = 0; column < m3[row].length; column++){
                    System.out.print(m3[row][column] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");
    


    //you don't know values, but you do know the sizes
    //creating a 5 x 5 matrix full of zeros
        int[][] m4 = new int[5][];
        m4[0] = new int[5];
        m4[1] = new int[5];
        m4[2] = new int[5];
        m4[3] = new int[5];
        m4[4] = new int[5];

            for(int row = 0; row < m4.length; row++){
                for(int column = 0; column < m4[row].length; column++){
                    System.out.print(m4[row][column] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");

        







    }
}
