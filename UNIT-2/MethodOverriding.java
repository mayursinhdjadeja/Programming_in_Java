/*
 * Write a java program to use method overriding.
*/

class Father 
{
    void display() 
    { 
        System.out.println("Father"); 
    }
}

class Son extends Father 
{
    void display() 
    { 
        System.out.println("Son"); 
    }
}

class MethodOverriding 
{
    public static void main(String args[]) 
    {
        Father ob1 = new Son();
        Father ob2 = new Father();
        ob1.display();
        ob2.display();
    }
}