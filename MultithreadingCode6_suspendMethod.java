package Railworld_India_PVT_Task;

import java.io.*;

class MultithreadingCode6_suspendMethod extends Thread {
    public void run()
    {
        for (int i = 1; i < 5; i++) {
            try {

                // thread to sleep for 500 milliseconds
                sleep(5);
                System.out.println(
                        "Currently running - "
                                + Thread.currentThread().getName());
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        // creating three threads
        MultithreadingCode6_suspendMethod t1 = new MultithreadingCode6_suspendMethod();
        MultithreadingCode6_suspendMethod t2 = new MultithreadingCode6_suspendMethod();
        MultithreadingCode6_suspendMethod t3 = new MultithreadingCode6_suspendMethod();

        // call run() method
        t1.start();
        t2.start();

        // suspend t2 thread
        t2.suspend();

        // call run() method
        t3.start();
    }
}
