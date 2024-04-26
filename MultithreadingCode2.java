package Railworld_India_PVT_Task;


class MyThread11 extends Thread {

    // Method inside MyThread2
    // run() method which is called as
    // soon as thread is started
    public void run()
    {

        // Print statement when the thread is called
        System.out.println("Thread1 is running");
    }
}

// Class 2
// Main thread Class extending main Thread Class
class MyThread22 extends Thread {

    // Method inside MyThread2
    // run() method which is called
    // as soon as thread is started
    public void run()
    {

        // run() method which is called as soon as thread is
        // started

        // Print statement when the thread is called
        System.out.println("Thread2 is running");
    }
}

// Class 3
// Main Class
class MultithreadingCode2  {

    // Main method
    public static void main(String[] args)
    {

        // Creating a thread object of our thread class
        MyThread11 obj1 = new MyThread11();
        MyThread22 obj2 = new MyThread22();

        // Getting the threads to the run state

        // This thread will transcend from runnable to run
        // as start() method will look for run() and execute
        // it
        obj1.start();

        // This thread will also transcend from runnable to
        // run as start() method will look for run() and
        // execute it
        obj2.start();
    }
}
