/*
 * Write a java program to implement Exception Chaining.
*/

class ExceptionChaining
{
    static void method() throws Exception
    {
        try
        {
            int a = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            throw new Exception("New Exception", e);
        }
    }

    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}