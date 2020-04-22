//Armando Galan-Cedeño  Assignment6B
//CS121 Spring 2020
//April 22, 2020
//Purpose: Using a Variable-Length Argument List

package variablelengthargumentlist;

public class VariableLengthArgumentList {

    public static void main(String[] args) {
        
    /*
    Calculate the product of a series of integers that are passed to a method 
    named "product" using a variable-length argument list. Test the method several
    times with a variety of different arguments.
    */
    
        //declaring and initializing int variables
        int n1 = 20;
        int n2 = 40;
        int n3 = 60;
        int n4 = 80;
        int n5 = 100;
        
        //displaying set of results
        System.out.println("These are the final results:");
        System.out.printf("\nThe product of n1 and n5 is: %d%n", (product(n1, n5)));
        System.out.printf("\nThe product of n2 and n4 is: %d%n", (product(n2, n4)));
        System.out.printf("\nThe product of n3, n1, and n5 is: %d%n", (product(n3, n1, n5)));
        System.out.printf("\nThe product of n4 and n3 is: %d%n", (product(n4, n3)));
        System.out.printf("\nThe product of n5, n4, n3, n2, and n1  is: %d%n", (product(n5, n4, n3, n2, n1)));
    }
    
    //product method
    public static int product(int... number)
    {
        //declaring and initializing int variable
        int num = 1;
        
        //Calculating the product of a series of integers
        for (int counter = 0; counter < number.length; counter++)
        {
            num = num * number[counter]; 
        }
        //returning the product result
        return num;
    }
}
