package Railworld_India_PVT_Task;


class Geek11 extends Thread {
    public void run()
    {
        synchronized (this)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
class Geek22 extends Thread {
    Geek11 geeks1;

    Geek22(Geek11 geeks1){
        this.geeks1 = geeks1;
    }

    public void run()
    {
        synchronized (this.geeks1)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");

            try {
                this.geeks1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
class Geek33 extends Thread {
    Geek11 geeks1;
    Geek33(Geek11 geeks1) { this.geeks1 = geeks1; }
    public void run()
    {
        synchronized (this.geeks1)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");

            this.geeks1.notifyAll();
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
class MultithreadingCode10_notifyAllMethod {
    public static void main(String[] args)
            throws InterruptedException
    {

        Geek11 geeks1 = new Geek11();
        Geek22 geeks2 = new Geek22(geeks1);
        Geek33 geeks3 = new Geek33(geeks1);
        Thread t1 = new Thread(geeks1, "Thread-1");
        Thread t2 = new Thread(geeks2, "Thread-2");
        Thread t3 = new Thread(geeks3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}
