/*
 * Write a java program to use Finally block in Exception Handling.
*/

class FinallyBlock
{
    public static void main(String args[])
    {
        int a = 10 , b = 0 ;

        System.out.println("Sum = " + (a+b));
        System.out.println("Sub = " + (a-b));
        System.out.println("Mul = " + (a*b));

        try
        {
            System.out.println("div = " + (a/b) ) ;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }

        finally
        {
            System.out.println("The Program END Here");
        }
    }
}