/*
 * Write a java program to use Static Inner Class.
*/
class StaticInnerClass 
{
    static int num = 10;
    static class Inner 
    {
        void display() 
        {
            System.out.println("Number = " + num);
        }
    }

    public static void main(String args[]) 
    {
        StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
        obj.display();
    }
}