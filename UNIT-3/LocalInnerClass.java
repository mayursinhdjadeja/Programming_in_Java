/*
 * Write a java program to use Local Inner Class.
*/

class LocalInnerClass 
{
    public void display() 
    {
        class Inner 
        {
            public void show() 
            {
                System.out.println("This is a Local Inner Class");
            }
        }
        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String args[]) 
    {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}