/*
 * Write a java program to implement custom exception 
*/

class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

class CustomException
{
    static void checkNumber(int num) throws MyException
    {
        if (num < 0)
        {
            throw new MyException("Number cannot be negative");
        }

        System.out.println("Number is valid");
    }

    public static void main(String args[])
    {
        try
        {
            checkNumber(-5);
        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}