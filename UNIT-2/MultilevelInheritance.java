/*
 * Write a java program to use multilevel inheritance.
 */

class GrandFather 
{
    void method1() 
    { 
        System.out.println("GrandFather"); 
    }
}

class Father extends GrandFather 
{
    void method2() 
    { 
        System.out.println("Father"); 
    }
}

class Son extends Father 
{
    void method3() 
    { 
        System.out.println("Son"); 
    }
}

public class MultilevelInheritance 
{
    public static void main(String args[]) 
    {
        Son ob = new Son();
        ob.method1();
        ob.method2();
        ob.method3();
    }
}
