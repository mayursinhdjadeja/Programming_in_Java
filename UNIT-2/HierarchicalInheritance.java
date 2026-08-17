/*
 * Write a java program to use Hierarchical inheritance.
*/

class Father 
{
    void method1() 
    { 
        System.out.println("Father"); 
    }
}

class Son1 extends Father 
{
    void method2() 
    { 
        System.out.println("Son1"); 
    }
}

class Son2 extends Father 
{
    void method3() 
    { 
        System.out.println("Son2"); 
    }
}

class HierarchicalInheritance 
{
    public static void main(String args[]) 
    {
        Son1 ob1 = new Son1();
        Son2 ob2 = new Son2();
        ob1.method1();
        ob1.method2();
        ob2.method1();
        ob2.method3();
    }
}