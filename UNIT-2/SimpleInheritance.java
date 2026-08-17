/*
 * Write a java program to perform simple inheritance.
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
    void show() 
    { 
        System.out.println("Son"); 
    }
}

class SimpleInheritance 
{
    public static void main(String args[]) 
    {
        Son ob = new Son();
        ob.display();
        ob.show();
    }
}
