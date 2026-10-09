/*
 * Write a java program to set Thread name and priority & test it. 
*/

class ThreadNamePriority extends Thread 
{
    public void run() 
    {
        System.out.println(getName());
        System.out.println(getPriority());
    }

    public static void main(String args[]) 
    {
        ThreadNamePriority t1 = new ThreadNamePriority();
        ThreadNamePriority t2 = new ThreadNamePriority();
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.setPriority(3);
        t2.setPriority(8);
        t1.start();
        t2.start();
    }
}