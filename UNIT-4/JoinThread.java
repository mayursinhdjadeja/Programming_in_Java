/*
 * Write a java program to join two threads which perform loop operations. 
*/

class JoinThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 3; i++) 
        {
            System.out.println(i);
        }
    }

    public static void main(String args[]) throws Exception 
    {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Completed");
    }
}