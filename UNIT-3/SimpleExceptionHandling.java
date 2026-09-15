/*
 * Write a java program to implement simple exception handling.
*/

class SimpleExceptionHandling
{
    public static void main(String args[])
    {
        int a = 10 , b = 2 ;
        int div = 0 ;

        try
        {
            div = a / b ;
        }

        catch(Exception e)
        {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("Division = " + div);
    }
}