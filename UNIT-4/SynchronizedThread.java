/*
 *  Write a java program to create two threads and make them Synchronized (Thread Safe).
*/

class SynchronizedThread 
{
    synchronized void display(String name) 
    {
        for (int i = 1; i <= 3; i++) 
        {
            System.out.println(name + " " + i);
        }
    }

    public static void main(String args[]) 
    {
        SynchronizedThread obj = new SynchronizedThread();
        Thread t1 = new Thread(() -> obj.display("Thread 1"));
        Thread t2 = new Thread(() -> obj.display("Thread 2"));
        t1.start();
        t2.start();
    }
}