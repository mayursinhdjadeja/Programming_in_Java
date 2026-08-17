/*
 * Write a java program to use Interface in java.
*/

interface Animal 
{
    void sound();
}

class Dog implements Animal 
{
    public void sound() 
    {
        System.out.println("Dog barks");
    }
}

class InterfaceDemo 
{
    public static void main(String args[]) 
    {
        Animal ob = new Dog();
        ob.sound();
    }
}