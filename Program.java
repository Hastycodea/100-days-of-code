import Day40.MultiThread;

public class Program {
    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();
        MultiThread multiThread2 = new MultiThread();

        Thread myThread = new Thread(multiThread);
        Thread myThread2 = new Thread(multiThread2);

        myThread.start();
        myThread2.start();

        // .start() runs on separate thread, .run() => runs on single thread
        // multiThread.start();
        // multiThread2.start();
    }
}
