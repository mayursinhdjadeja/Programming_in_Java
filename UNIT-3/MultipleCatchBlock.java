/*
 * Write a java program to use Multiple Catch Block.
*/

class MultipleCatchBlock
{
    public static void main(String args[])
    {
        try
        {
            int a[] = {10, 20, 30};
            System.out.println(a[5]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        catch(Exception e)
        {
            System.out.println("Other Exception");
        }
    }
}