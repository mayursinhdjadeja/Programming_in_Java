/*
 * Write a java program to create a thread using Thread Class.
*/

class ThreadClassDemo extends Thread 
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
        ThreadClassDemo t = new ThreadClassDemo();
        t.start();
    }
}
