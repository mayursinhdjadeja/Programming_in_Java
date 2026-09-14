/*
 *  Write a java program to use Multiple inheritance using interface. 
*/

interface A 
{
    void showA();
}

interface B 
{
    void showB();
}

class C implements A, B 
{
    public void showA() 
    {
        System.out.println("A");
    }

    public void showB() 
    {
        System.out.println("B");
    }
}

class MultipleInheritance 
{
    public static void main(String args[]) 
    {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}