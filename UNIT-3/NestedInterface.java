/*
 * Write a java program to use Nested Interface.
*/

class NestedInterface 
{
    interface Inner 
    {
        void display();
    }
    public static void main(String args[]) 
    {
        Inner obj = new Inner() 
        {
            public void display() 
            {
                System.out.println("This is a Nested Interface");
            }
        };
        obj.display();
    }
}