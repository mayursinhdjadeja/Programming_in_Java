/*
 * Write a java program to implement Arithmetic Exception.
*/

class ArithmeticExceptionDemo
{
    public static void main(String args[])
    {
        int a = 10 , b = 2 ;

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
    }
}