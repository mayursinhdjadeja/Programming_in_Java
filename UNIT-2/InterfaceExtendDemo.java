/*
 * Write a java program to extend one interface into another interface.
*/

interface A 
{
    void methodA();
}

interface B extends A 
{
    void methodB();
}

class Demo implements B 
{
    public void methodA() 
    { 
        System.out.println("Method A"); 
    }
    public void methodB() 
    { 
        System.out.println("Method B"); 
    }
}

class InterfaceExtendDemo 
{
    public static void main(String args[]) 
    {
        Demo ob = new Demo();
        ob.methodA();
        ob.methodB();
    }
}