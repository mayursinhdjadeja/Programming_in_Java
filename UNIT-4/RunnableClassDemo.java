/*
 *  Write a java program to create a thread using Runnable class. 
*/

class RunnableClassDemo implements Runnable 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread: " + i);
        }
    }

    public static void main(String args[]) 
    {
        RunnableClassDemo obj = new RunnableClassDemo();
        Thread t = new Thread(obj);
        t.start();
    }
}