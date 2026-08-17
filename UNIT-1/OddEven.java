/*
 * Write a java program to find ODD or EVEN number using command line argument.
*/

class OddEven 
{
    public static void main(String args[]) 
    {
        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0)
        {
            System.out.println("EVEN.");
        }
        else
        {
            System.out.println("ODD.");
        }
    }
}