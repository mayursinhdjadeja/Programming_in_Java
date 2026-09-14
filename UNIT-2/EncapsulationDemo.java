/*
 * Write a java program to demonstrate encapsulation.
*/

class Student 
{
    private int age;

    void setAge(int a) 
    {
        age = a;
    }

    int getAge() 
    {
        return age;
    }
}

class EncapsulationDemo 
{
    public static void main(String args[]) 
    {
        Student s = new Student();
        s.setAge(20);
        System.out.println(s.getAge());
    }
}