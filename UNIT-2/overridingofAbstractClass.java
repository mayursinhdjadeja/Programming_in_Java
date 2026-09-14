/*
 * 20. Write a java program to perform overriding of abstract class.
*/

abstract class A 
{
    abstract void show();
}

class B extends A 
{
    void show() 
    {
        System.out.println("B");
    }
}

class overridingofAbstractClass 
{
    public static void main(String args[]) 
    {
        B ob = new B();
        ob.show();
    }
}